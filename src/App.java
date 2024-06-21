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


    }
}