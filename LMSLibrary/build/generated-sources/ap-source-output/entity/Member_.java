package entity;

import entity.LendAndReturn;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-01-28T10:45:25")
@StaticMetamodel(Member.class)
public class Member_ { 

    public static volatile SingularAttribute<Member, String> identityNo;
    public static volatile SingularAttribute<Member, String> firstName;
    public static volatile SingularAttribute<Member, String> lastName;
    public static volatile SingularAttribute<Member, String> address;
    public static volatile SingularAttribute<Member, Character> gender;
    public static volatile SingularAttribute<Member, String> phone;
    public static volatile ListAttribute<Member, LendAndReturn> lendAndReturns;
    public static volatile SingularAttribute<Member, Integer> age;
    public static volatile SingularAttribute<Member, Long> memberId;

}