public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager =
                new EmployeeManager(10);

        manager.addEmployee(
                new Employee(101,
                        "Rahul",
                        "Developer",
                        50000));

        manager.addEmployee(
                new Employee(102,
                        "Priya",
                        "Tester",
                        45000));

        manager.addEmployee(
                new Employee(103,
                        "Kiran",
                        "Manager",
                        75000));

        manager.displayEmployees();

        System.out.println("\nSearching Employee:");

        Employee employee =
                manager.searchEmployee(102);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee Not Found");
        }

        System.out.println();

        manager.deleteEmployee(102);

        manager.displayEmployees();
    }
}