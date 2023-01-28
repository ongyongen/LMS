
package ejb.session.stateless;

import entity.LendAndReturn;
import exception.BookNotFoundException;
import exception.MemberNotFoundException;
import javax.ejb.Remote;

/**
 *
 * @author ongyongen
 */
@Remote
public interface LendAndReturnSessionBeanRemote {
    
    public Long createLendAndReturnRecord(String memberIdentityNo, String bookTitle, LendAndReturn record) throws MemberNotFoundException, BookNotFoundException;

}
