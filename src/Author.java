public class Author {
    public final String name;
    public final String lastName;
    public Author(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }
}
