public class Book {
 private int isbn = 0;
 private String publisher;
 private String author;
 private String title;
 private int year = 0;
 private String type;

    public Book(int isbn, String publisher, String author, String title, int year, String type) {
        this.isbn = isbn;
        this.publisher = publisher;
        this.author = author;
        this.title = title;
        this.year = year;
        this.type = type;
    }



    @Override
    public String toString() {
        return "Book: " +
                "isbn= " + isbn +
                " publisher= " + publisher +
                " author= " + author +
                " title= " + title +
                " year= " + year +
                " type= " + type;
    }
}
