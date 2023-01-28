package entity;

import entity.LendAndReturn;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-01-28T10:45:25")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, String> author;
    public static volatile SingularAttribute<Book, String> isbn;
    public static volatile ListAttribute<Book, LendAndReturn> lendAndReturns;
    public static volatile SingularAttribute<Book, String> title;
    public static volatile SingularAttribute<Book, Long> bookId;

}