package OBJECTS;

public class Book implements Borrowable{
    private String book_title;
    private String book_author;
    private String book_isbnNumber;
    private int book_publicationYear;

    public Book(String title, String author, String isbnNumber, int publicationYear) {
        setTitle(title);
        setAuthor(author);
        setIsbnNumber(isbnNumber);
        setPublicationYear(publicationYear);
    }


    @Override
    public void borrow(String _ID) {
        System.out.printf("Member %s borrowed a book titled %s authored by %s", _ID, getTitle(), getAuthor());
    }

    public String getTitle() {
        return book_title;
    }

    public void setTitle(String title) {
        this.book_title = title;
    }

    public String getAuthor() {
        return book_author;
    }

    public void setAuthor(String author) {
        this.book_author = author;
    }

    public String getIsbnNumber() {
        return book_isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.book_isbnNumber = isbnNumber;
    }

    public int getPublicationYear() {
        return book_publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.book_publicationYear = publicationYear;
    }
}
