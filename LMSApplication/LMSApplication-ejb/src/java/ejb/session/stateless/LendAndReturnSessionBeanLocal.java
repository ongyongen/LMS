/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb.session.stateless;

import entity.LendAndReturn;
import exception.BookNotFoundException;
import exception.MemberNotFoundException;
import javax.ejb.Local;

/**
 *
 * @author ongyongen
 */
@Local
public interface LendAndReturnSessionBeanLocal {

    public Long createLendAndReturnRecord(String memberIdentityNo, String bookTitle, LendAndReturn record) throws MemberNotFoundException, BookNotFoundException;    
}
