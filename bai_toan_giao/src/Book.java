public class Book {
    private String bookCode;
    private String nameBook;
    private float price;
    private String author;

    public Book() {
    }

    public Book(String bookCode, String nameBook, float price, String author) {
        this.bookCode = bookCode;
        this.nameBook = nameBook;
        this.price = price;
        this.author = author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookCode='" + bookCode + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
