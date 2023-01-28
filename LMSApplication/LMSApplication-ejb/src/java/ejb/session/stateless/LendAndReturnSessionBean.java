
package ejb.session.stateless;

import entity.Book;
import entity.LendAndReturn;
import entity.Member;
import exception.BookNotFoundException;
import exception.MemberNotFoundException;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

    
}
