package entity;

import entity.Book;
import entity.Member;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-01-28T11:09:40")
@StaticMetamodel(LendAndReturn.class)
public class LendAndReturn_ { 

    public static volatile SingularAttribute<LendAndReturn, Date> returnDate;
    public static volatile SingularAttribute<LendAndReturn, Long> lendId;
    public static volatile SingularAttribute<LendAndReturn, Date> lendDate;
    public static volatile SingularAttribute<LendAndReturn, Book> book;
    public static volatile SingularAttribute<LendAndReturn, BigDecimal> fineAmount;
    public static volatile SingularAttribute<LendAndReturn, Member> member;

}