
package ejb.session.stateless;

import entity.Staff;
import exception.InvalidLoginException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ongyongen
 */
@Local
public interface StaffSessionBeanLocal {

    public Long createNewStaff(Staff staff);

    public List<Staff> retrieveAllStaff();

    public Staff retrieveStaffByUsernameAndPassword(String username, String password) throws InvalidLoginException;
    
}
