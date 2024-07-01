import java.util.Objects;

public class Employee {
    private String name;
    private String lastname;
    private String patronymic;
    private int salary;
    private int secession;
    private int id;
    private static int nextId = 1;
    public Employee(String name, String lastname, String patronymic, int salary, int secession) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.salary = salaryCheck(salary);
        this.secession = secessionCheck(secession);
        this.id = nextId++;
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) { //set
        this.salary = salaryCheck(salary);
    }
    public int getSecession() {
        return secession;
    }
    public void setSecession(int secession) { // set
        this.secession = secessionCheck(secession);
    }
    public int getId() {
        return id;
    }
    public boolean equals(Object o) {
        if (this == o){
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id && secession == employee.secession &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(lastname, employee.lastname) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(patronymic, employee.patronymic);
    }
    public int hashCode() {
        return Objects.hash(id, name, lastname, patronymic, secession, salary);
    }
    public String toString() {
        return "id " + id + " - employee " + name + " " + lastname + " " + patronymic +
                ", department " + secession + ", salary " + salary;
    }
    private int salaryCheck(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("salary is a negative number");
        }
        return salary;
    }
    private int secessionCheck(int secession) {
        if (secession < 1 || secession > 5) {
            throw new IllegalArgumentException("departments cannot be less than one and more than five");
        }
        return secession;
    }
}
