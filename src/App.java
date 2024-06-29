public class App {

    public static void main(String[] args) {

        Author author = new Author("Michael", "Bulgakov");
        Author author1 = new Author("George", "Oruel");
        System.out.println(author.getName() + " " + author.getLastName());
        System.out.println(author1.getName() + " " + author1.getLastName());

        Book book = new Book("\nMaster & Margarita", author, 1940);
        Book book1 = new Book("1984", author1, 1949);
        System.out.println(book.getTitle());
        System.out.println(book1.getTitle());

        System.out.println("book.getAuthor() = " + book.getAuthor());
        System.out.println("book1.getAuthor() = " + book1.getAuthor());

        System.out.println("\nbook1.getYear() = " + book1.getYear());
        book1.setYear(1950);
        System.out.println("book1.getYear() = " + book1.getYear());

        System.out.println("\nauthor = " + author + "\nauthor1 = " + author1);
        System.out.println(book + "\n" + book1);

        System.out.println("author.equals(author) = " + author.equals(author));
        System.out.println("author.equals(author1) = " + author.equals(author1));

        System.out.println("book.equals(book) = " + book.equals(book));
        System.out.println("book.equals(book1) = " + book.equals(book1));
    }
}