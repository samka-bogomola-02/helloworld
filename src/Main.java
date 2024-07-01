public class Main {
    public static void main(String[] args) {
        EmployeeBook employees = new EmployeeBook();
        employees.printEmployees();
        System.out.println(" ");

        System.out.println("Total cost of salary per month: " + employees.getTotalSalary());
        System.out.println("Employee with minimum salary: " + employees.getEmployeeWithMinSalary());
        System.out.println("Employee with maximum salary: " + employees.getEmployeeWithMaxSalary());
        System.out.println("Average salary per month: " + employees.totalMonthlyAverageSalary());

        EmployeeBook employeeManagement = new EmployeeBook();

        int employeeIdToDelete = 20; // ID сотрудника, которого нужно удалить
        boolean deleted = employeeManagement.deleteEmployeeById(employeeIdToDelete);
        if (deleted) {
            System.out.println("Employee with ID " + employeeIdToDelete + " deleted.");
        } else {
            System.out.println("Employee with ID " + employeeIdToDelete + " not found.");
        }

        Employee newEmployee = new Employee("Луис", "Альфредо", "Гаравито", 57000, 3); // Создаем нового сотрудника
        boolean added = employeeManagement.addEmployee(newEmployee);
        if (added) {
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("There are no additional places for an employee.");
        }
        int employeeIdToFind = 21; // ID сотрудника, которого нужно найти
        Employee foundEmployee = employeeManagement.findEmployeeById(employeeIdToFind);
        if (foundEmployee != null) {
            System.out.println("Employee found: " + foundEmployee.getLastname() + " " + foundEmployee.getName() + " " + foundEmployee.getPatronymic());
        } else {
            System.out.println("Employee with ID " + employeeIdToFind + " not found.");
        }
    }
}