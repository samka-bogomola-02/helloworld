public class EmployeeBook {
    public Employee[] employees;
    public EmployeeBook() {
        employees = new Employee[10];
        initializeEmployees();
        System.out.println(" ");
    }
    private void initializeEmployees() {
        employees[0] = new Employee("Анато́лий", "Оноприе́нко", "Ю́рьевич", 60_500, 2);
        employees[1] = new Employee("Алекса́ндр", "Пичу́шкин", "Ю́рьевич", 47_000, 1);
        employees[2] = new Employee("Михаил", "Попко́в", "Ви́кторович", 62_000, 5);
        employees[3] = new Employee("Андре́й", "Чикати́ло", "Рома́нович", 140_000, 4);
        employees[4] = new Employee("Сергей", "Ткач", "Фёдорович", 115_000, 5);
        employees[5] = new Employee("Алексей", "Выговский", "Олегович", 95_000, 3);
        employees[6] = new Employee("Теодо́р", "Ба́нди", "Ро́берт", 82_000, 4);
        employees[7] = new Employee("Ра́дик", "Таги́ров", "Таги́рович", 125_500, 2);
        employees[8] = new Employee("Да́рья", "Салтыко́ва", "Никола́евна", 110_000, 3);
        employees[9] = new Employee("Пе́дро", "Ло́пес", "Ало́нсо", 75_000, 1);

    }
    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public int getTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
    public Employee getEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }
    public Employee getEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }
    public int totalMonthlyAverageSalary() {
        return getTotalSalary() / employees.length;
    }
    public void printEmployeesFullNames() {
        int counter = 1;
        for (Employee employee : employees) {
            System.out.println(counter + ") " + employee.getLastname() + " " + employee.getName() + " " + employee.getPatronymic());
            counter++;
        }
    }
    public void EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
    }

    public boolean deleteEmployeeById(int employeeId) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == employeeId) {
                employees[i] = null; // Удаляем сотрудника
                return true;
            }
        }
        return false;
    }
    public boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true; // Место для сотрудника найдено
            }
        }
        return false;
    }
    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == employeeId) {
                return employee; // Найден сотрудник с указанным ID
            }
        }
        return null;
    }
}
