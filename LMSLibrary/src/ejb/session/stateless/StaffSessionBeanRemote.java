
package ejb.session.stateless;

import entity.Staff;
import exception.InvalidLoginException;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ongyongen
 */
@Remote
public interface StaffSessionBeanRemote {
     
    public Long createNewStaff(Staff staff);

    public List<Staff> retrieveAllStaff();
    
    public Staff retrieveStaffByUsernameAndPassword(String username, String password) throws InvalidLoginException;

    
}
