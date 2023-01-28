
package lmsclient;

import ejb.session.stateless.BookSessionBeanRemote;
import ejb.session.stateless.LendAndReturnSessionBeanRemote;
import ejb.session.stateless.MemberSessionBeanRemote;
import ejb.session.stateless.StaffSessionBeanRemote;
import entity.Book;
import entity.Member;
import entity.Staff;
import exception.BookNotFoundException;
import exception.InvalidLoginException;
import exception.LendingNotFoundException;
import exception.MemberNotFoundException;
import exception.StaffNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;

/**
 *
 * @author ongyongen
 */
public class Main {

    @EJB
    private static LendAndReturnSessionBeanRemote lendAndReturnSessionBeanRemote;

//    @EJB
//    private static MemberSessionBeanRemote memberSessionBeanRemote;
//
//    @EJB
//    private static BookSessionBeanRemote bookSessionBeanRemote;

    @EJB
    private static StaffSessionBeanRemote staffSessionBeanRemote;

    
    
    public static void main(String[] args) {
        
    }
}
    
//        try {
//            staffSessionBeanRemote.updateStaff(1l, "alii", "tan", "us", "pw");
//            lendAndReturnSessionBeanRemote.retrieveFineAmountForRecord(1000l);
//            lendAndReturnSessionBeanRemote.returnBookNotLate(100l, new Date());
//            staffSessionBeanRemote.deleteStaff(2l);
//            staffSessionBeanRemote.deleteStaff(3l);

//            Date date1 = new Date("Sat Jan 28 16:38:31 SGT 2023");
//            Date date2 = new Date("Sun Jan 29 12:20:00 SGT 2023");
//            Long diff = date1.getTime() - date2.getTime();
//            Long days = (diff / (1000*60*60*24));
//            System.out.println(days);

//            String input1 = "2023-01-01 04:03";
//            String input2 = "2023-01-14 12:00";
//            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            
//            Date date1 = parser.parse(input1);
//            Date date2 = parser.parse(input2);
//
//
//            long diff = Math.abs(date1.getTime() - date2.getTime());
//            long days = diff / (1000*60*60*24);
//
//            System.out.println(days);




//            System.out.println(staffSessionBeanRemote.retrieveStaffByUsernameAndPassword("eric", "password"));
//            System.out.println(staffSessionBeanRemote.retrieveStaffByUsernameAndPassword("sarah", "password"));
//
//            System.out.println(staffSessionBeanRemote.retrieveStaffByUsernameAndPassword("ericd", "password"));
//            System.out.println(staffSessionBeanRemote.retrieveStaffByUsernameAndPassword("sarah", "Password"));

//            System.out.println(lendAndReturnSessionBeanRemote.retrieveLendingRecordByIdNoAndTitle("S8900678A", "Anna Karenina"));
//            System.out.println(lendAndReturnSessionBeanRemote.retrieveLendingRecordByIdNoAndTitle("S8900678A", "Madame Bovary"));
//            System.out.println(lendAndReturnSessionBeanRemote.retrieveLendingRecordByIdNoAndTitle("S8581028X", "The Hobbit"));
//            System.out.println(lendAndReturnSessionBeanRemote.retrieveLendingRecordByIdNoAndTitle("S890067A", "Hamle"));

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
//        } catch (InvalidLoginException ex) {
//            System.out.println("InvalidLoginException");
//        } catch (LendingNotFoundException ex) {
//            System.out.println("LendingNotFoundException");
//        } catch (BookNotFoundException ex) {
//            System.out.println("BookNotFoundException");
//        } catch (MemberNotFoundException ex) {
//            System.out.println("MemberNotFoundException");
//        }
//        } catch (StaffNotFoundException ex) {
//            System.out.println("StaffNotFoundException");
//        } catch (LendingNotFoundException ex) {
//            System.out.println("LendingNotFoundException");
//        } catch (BookNotFoundException ex) {
//            System.out.println("BookNotFoundException");
//        } catch (MemberNotFoundException ex) {
//            System.out.println("MemberNotFoundException");
//        }
//    
//   
//    }
//    
//}
