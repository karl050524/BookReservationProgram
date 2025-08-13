package USERS;

import OBJECTS.Book;

public class Member implements Person{
    private String member_Name;
    private String member_Email;
    private String member_ID;

    public Member(String name, String email, String id){
        setMember_Name(name);
        setMember_Email(email);
        setMember_ID(id);
    }
    public void setMember_Name(String member_Name) {
        this.member_Name = member_Name;
    }

    public void setMember_Email(String member_Email) {
        this.member_Email = member_Email;
    }

    public void setMember_ID(String member_ID) {
        this.member_ID = member_ID;
    }

    @Override
    public String getName() {
        return member_Name;
    }

    @Override
    public String getEmailAddress() {
        return member_Email;
    }

    @Override
    public String getID() {
        return member_ID;
    }
}
