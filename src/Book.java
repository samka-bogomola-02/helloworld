import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private int year;
    public Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
    public String toString() {
        return String.format("%s %s %s", title, author, year);
    }
}
