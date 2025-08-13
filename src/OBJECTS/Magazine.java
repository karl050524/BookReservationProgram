package OBJECTS;

public class Magazine implements Borrowable{
    private String magazine_title;
    private String magazine_author;
    private String magazine_isbnNumber;
    private String magazine_issueDate;

    public Magazine(String title, String author, String isbnNumber, String issueDate){
        setMagazine_title(title);
        setMagazine_author(author);
        setMagazine_isbnNumber(isbnNumber);
        setMagazine_issueDate(issueDate);
    }

    @Override
    public void borrow(String _ID) {
        System.out.printf("Member %s borrowed a book titled %s authored by %s", _ID, getMagazine_title(), getMagazine_author());
    }

    public String getMagazine_title() {
        return magazine_title;
    }

    public void setMagazine_title(String magazine_title) {
        this.magazine_title = magazine_title;
    }

    public String getMagazine_author() {
        return magazine_author;
    }

    public void setMagazine_author(String magazine_author) {
        this.magazine_author = magazine_author;
    }

    public String getMagazine_isbnNumber() {
        return magazine_isbnNumber;
    }

    public void setMagazine_isbnNumber(String magazine_isbnNumber) {
        this.magazine_isbnNumber = magazine_isbnNumber;
    }

    public String getMagazine_issueDate() {
        return magazine_issueDate;
    }

    public void setMagazine_issueDate(String magazine_issueDate) {
        this.magazine_issueDate = magazine_issueDate;
    }
}
