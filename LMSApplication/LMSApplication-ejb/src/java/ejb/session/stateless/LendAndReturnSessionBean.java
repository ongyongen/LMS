
package ejb.session.stateless;

import entity.Book;
import entity.LendAndReturn;
import entity.Member;
import exception.BookNotFoundException;
import exception.LendingNotFoundException;
import exception.MemberNotFoundException;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ongyongen
 */
@Stateless
public class LendAndReturnSessionBean implements LendAndReturnSessionBeanRemote, LendAndReturnSessionBeanLocal {

    @EJB
    private MemberSessionBeanLocal memberSessionBeanLocal;

    @EJB
    private BookSessionBeanLocal bookSessionBeanLocal;

    @PersistenceContext(unitName = "LMSApplication-ejbPU")
    private EntityManager em;

    @Override
    public Long createLendAndReturnRecord(String memberIdentityNo, String bookTitle, LendAndReturn record) throws MemberNotFoundException, BookNotFoundException {
        Member member = memberSessionBeanLocal.retrieveMemberByIdentityNo(memberIdentityNo);
        Book book = bookSessionBeanLocal.retrieveBookByTitle(bookTitle);
        
        record.setBook(book);
        record.setMember(member);
        
        em.persist(record);
        em.flush();
        
        return record.getLendId();
    }
    
    public List<LendAndReturn> retrieveAllLendingRecords() {
        String queryString = "SELECT record FROM LendAndReturn record";
        Query query = em.createQuery(queryString);
        return query.getResultList();   
    }
    
    @Override
    public LendAndReturn retrieveLendingRecordByIdNoAndTitle(String idNo, String title) throws LendingNotFoundException, BookNotFoundException, MemberNotFoundException {
        Long bookId = bookSessionBeanLocal.retrieveBookByTitle(title).getBookId();
        Long memberId = memberSessionBeanLocal.retrieveMemberByIdentityNo(idNo).getMemberId();
           
        Query query = em.createQuery("SELECT record FROM LendAndReturn record "
                + "WHERE record.book.bookId = :bookId "
                + "AND record.member.memberId = :memberId");
 
        query.setParameter("bookId", bookId);
        query.setParameter("memberId", memberId);

        
        if (query.getResultList().isEmpty()) {
            throw new LendingNotFoundException();
        } else {
            return (LendAndReturn)query.getSingleResult();
        }
    }

    
}
