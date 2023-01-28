/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb.session.stateless;

import entity.Staff;
import exception.InvalidLoginException;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ongyongen
 */
@Stateless
public class StaffSessionBean implements StaffSessionBeanRemote, StaffSessionBeanLocal {

    @PersistenceContext(unitName = "LMSApplication-ejbPU")
    private EntityManager em;

    @Override
    public Long createNewStaff(Staff staff) {
        em.persist(staff);
        em.flush();
        return staff.getStaffId();
    }
    
    @Override
    public List<Staff> retrieveAllStaff() {
        String queryString = "SELECT s FROM Staff s";
        Query query = em.createQuery(queryString);
        return query.getResultList();
    }
    
    @Override
    public Staff retrieveStaffByUsernameAndPassword(String username, String password) throws InvalidLoginException {
        
        Query query = em.createQuery("SELECT s FROM Staff s "
                + "WHERE s.userName = :username "
                + "AND s.password = :password");
        query.setParameter("username", username);
        query.setParameter("password", password);
        
        if (query.getResultList().isEmpty()) {
            throw new InvalidLoginException();
        } else {
            return (Staff)query.getSingleResult();
        }
    }
    
}
