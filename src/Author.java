public class Author {
    private String name;
    private String lastName;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Author temp = (Author) obj;
        boolean result = temp.name.equals(this.name) && temp.lastName.equals(this.lastName);
        return result;
    }

    public int hashCode() {
        return name.hashCode() + lastName.hashCode();
    }
    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
