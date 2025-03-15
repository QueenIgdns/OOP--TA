package MotorPH_OOP;
import java.util.List;
import java.util.Scanner;
import MotorPH_OOP.Employee;

public class Main {
    public static void main(String[] args) {
        Employee empwithmethod =
        
        // Read employees data from CSV
        CSVReader csvReader = new CSVReader();
        String csvFile = "src/MotorPH_OOP/employees.csv";  // Path to CSV file

        List<CSVReader.Employee> employees = csvReader.readEmployeesFromCSV(csvFile);
        
        // Check if there are employees loaded
        if (employees.isEmpty()) {
            System.out.println("No employees found. Please check the CSV file.");
            return;
        }

        // Prompt user for login credentials
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Check if entered credentials match any employee
        boolean loginSuccessful = false;
        for (CSVReader.Employee employee : employees) {
            if (employee.username.equals(inputUsername) && employee.password.equals(inputPassword)) {
                System.out.println("Login successful! Welcome, " + employee.firstName + " " + employee.lastName);
                
                // If login is successful, calculate salary and overtime
                double hoursWorked = 160;  // Assuming full-time (40 hours/week for 4 weeks)
                double overtimeHours = 10;  // 10 hours of overtime
                
                // Create an instance of OvertimeComputation
                OvertimeComputation overtimeComputation = new OvertimeComputation();
                
                // Calculate overtime pay
                double overtimePay = overtimeComputation.calculateOvertime(8, overtimeHours, employee.hourlyRate); // 8 regular hours
                
                // Calculate salary (you can adjust deduction as needed)
                double deductions = 5000;  // Example deductions
                double salary = employee.calculateSalary(hoursWorked, overtimeHours, deductions);  // Pass overtimeHours
                
                // Display the salary and overtime pay
                System.out.println("Total Salary: " + salary);
                System.out.println("Overtime Pay: " + overtimePay);
                
                loginSuccessful = true;
                break;
            }
        }

        // If login is not successful, system will show an error
        if (!loginSuccessful) {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
