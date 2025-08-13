import OBJECTS.*;
import USERS.*;

public class MainProgram {
    public static void main(String[] args) {
        Member member = new Member("John Doe", "anon@domain.com","0123456789");
        Book book = new Book("Object Oriented Programming Cheatsheet", "Bob","164891122",2005);

        book.borrow(member.getID());

        Librarian librarian = new Librarian("Karl Oliva", "karlalfonsogoliva@gmail.com","1600018953");
    }
}
