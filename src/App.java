public class App {

    public static void main(String[] args) {

        Author author = new Author("Michael", "Bulgakov");
        Author author1 = new Author("George", "Oruel");
        System.out.println(author.name + " " + author.lastName);
        System.out.println(author1.name + " " + author1.lastName);
        Book book = new Book("Master & Margarita", author, 1940);
        Book book1 = new Book("1984", author1, 1949);
        System.out.println("book1.getYear() = " + book1.getYear());
        book1.setYear(1950);
        System.out.println("book1.getYear() = " + book1.getYear());
    }
}