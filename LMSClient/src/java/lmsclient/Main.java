
package lmsclient;

import ejb.session.stateless.BookSessionBeanRemote;
import ejb.session.stateless.MemberSessionBeanRemote;
import ejb.session.stateless.StaffSessionBeanRemote;
import entity.Book;
import entity.Member;
import entity.Staff;
import exception.InvalidLoginException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;

/**
 *
 * @author ongyongen
 */
public class Main {

    @EJB
    private static MemberSessionBeanRemote memberSessionBeanRemote;

    @EJB
    private static BookSessionBeanRemote bookSessionBeanRemote;

    @EJB
    private static StaffSessionBeanRemote staffSessionBeanRemote;

    
    
    public static void main(String[] args) {
        try {
            System.out.println(staffSessionBeanRemote.retrieveStaffByUsernameAndPassword("eric", "password"));
            System.out.println(staffSessionBeanRemote.retrieveStaffByUsernameAndPassword("sarah", "password"));

            System.out.println(staffSessionBeanRemote.retrieveStaffByUsernameAndPassword("ericd", "password"));
            System.out.println(staffSessionBeanRemote.retrieveStaffByUsernameAndPassword("sarah", "Password"));


//        List<Staff> allStaff = staffSessionBeanRemote.retrieveAllStaff();
//        System.out.println("===== All Staff =====");
//        for (Staff staff : allStaff) {
//            System.out.println(staff.getFirstName());
//        }
//        
//        List<Member> allMembers = memberSessionBeanRemote.retrieveAllMembers();
//        System.out.println("===== All Members =====");
//        for (Member member : allMembers) {
//            System.out.println(member.getFirstName());
//        }
//        
//        List<Book> allBooks = bookSessionBeanRemote.retrieveAllBooks();
//        System.out.println("===== All Books =====");
//        for (Book book : allBooks) {
//            System.out.println(book.getTitle());
//        }



//        
        } catch (InvalidLoginException ex) {
            System.out.println("Invalid");
        }
    }
    
}