package USERS;

import OBJECTS.Book;

public class Librarian implements Person{
    private String librarian_Name;
    private String librarian_Email;
    private String librarian_ID;

    public Librarian(String name, String email, String id) {
        setLibrarian_Name(name);
        setLibrarian_Email(email);
        setLibrarian_ID(id);
    }

    @Override
    public String getName() {
        return librarian_Name;
    }

    @Override
    public String getEmailAddress() {
        return librarian_Email;
    }

    @Override
    public String getIdentification() {
        return librarian_ID;
    }

    public void setLibrarian_Name(String librarian_Name) {
        this.librarian_Name = librarian_Name;
    }

    public void setLibrarian_Email(String librarian_Email) {
        this.librarian_Email = librarian_Email;
    }

    public void setLibrarian_ID(String librarian_ID) {
        this.librarian_ID = librarian_ID;
    }

    public void addBook(Book book){
        // Adds book to library
        System.out.printf("%s added to the Library",book.getTitle());
    }
    public void removeBook(Book book){
        // Removes book from library
        System.out.printf("%s removed from the Library",book.getTitle());
    }
}
