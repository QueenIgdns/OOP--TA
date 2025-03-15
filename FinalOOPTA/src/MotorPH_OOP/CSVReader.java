package MotorPH_OOP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 


public class CSVReader {

//    static class Employee {
//        String employeeId;
//        String lastName;
//        String firstName;
//        String username;
//        String password;
//        String birthday;
//        String address;
//        String phoneNumber;
//        String sssNumber;
//        String philhealthNumber;
//        String tinNumber;
//        String pagibigNumber;
//        String status;
//        String position;
//        String immediateSupervisor;
//        double basicSalary;
//        double riceSubsidy;
//        double phoneAllowance;
//        double clothingAllowance;
//        double grossSemiMonthlyRate;
//        double hourlyRate;
//
//        public Employee(String employeeId, String lastName, String firstName, String username, String password,
//                        String birthday, String address, String phoneNumber, String sssNumber, String philhealthNumber,
//                        String tinNumber, String pagibigNumber, String status, String position, String immediateSupervisor,
//                        double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance,
//                        double grossSemiMonthlyRate, double hourlyRate) {
//            this.employeeId = employeeId;
//            this.lastName = lastName;
//            this.firstName = firstName;
//            this.username = username;
//            this.password = password;
//            this.birthday = birthday;
//            this.address = address;
//            this.phoneNumber = phoneNumber;
//            this.sssNumber = sssNumber;
//            this.philhealthNumber = philhealthNumber;
//            this.tinNumber = tinNumber;
//            this.pagibigNumber = pagibigNumber;
//            this.status = status;
//            this.position = position;
//            this.immediateSupervisor = immediateSupervisor;
//            this.basicSalary = basicSalary;
//            this.riceSubsidy = riceSubsidy;
//            this.phoneAllowance = phoneAllowance;
//            this.clothingAllowance = clothingAllowance;
//            this.grossSemiMonthlyRate = grossSemiMonthlyRate;
//            this.hourlyRate = hourlyRate;
//        }
//
//        @Override
//        public String toString() {
//            return String.format("Employee ID: %s, Name: %s %s, Position: %s", 
//                this.employeeId, 
//                this.firstName, 
//                this.lastName, 
//                this.position);
//        }
//    }

    public List<Employee> readEmployeesFromCSV(String csvFile) {
        String line;
        String delimiter = ",";  // The delimiter used in the CSV file (comma-separated)
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] values = line.split(delimiter);

                // Parse double values safely with a helper function
                double basicSalary = parseDoubleSafe(values[15]);
                double riceSubsidy = parseDoubleSafe(values[16]);
                double phoneAllowance = parseDoubleSafe(values[17]);
                double clothingAllowance = parseDoubleSafe(values[18]);
                double grossSemiMonthlyRate = parseDoubleSafe(values[19]);
                double hourlyRate = parseDoubleSafe(values[20]);

                Employee employee = new Employee(
                        values[0],  // Employee ID
                        values[1],  // Last Name
                        values[2],  // First Name
                        values[3],  // Username
                        values[4],  // Password
                        values[5],  // Birthday
                        values[6],  // Address
                        values[7],  // Phone Number
                        values[8],  // SSS #
                        values[9],  // Philhealth #
                        values[10], // TIN #
                        values[11], // Pag-ibig #
                        values[12], // Status
                        values[13], // Position
                        values[14], // Immediate Supervisor
                        basicSalary,
                        riceSubsidy,
                        phoneAllowance,
                        clothingAllowance,
                        grossSemiMonthlyRate,
                        hourlyRate
                );
                employees.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }

    // Helper method to safely parse doubles
    private double parseDoubleSafe(String value) {
        try {
            return value.equals("N/A") ? 0.0 : Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return 0.0; // Return 0.0 if the value is not a valid number
        }
    }

    public static void main(String[] args) {
        
        CSVReader csvReader = new CSVReader();
        String csvFile = "src/MotorPH_OOP/employees.csv";  // Path to your CSV file
        
        List<Employee> employees = csvReader.readEmployeesFromCSV(csvFile);
        
        if (employees.isEmpty()) {
            System.out.println("No employees found. Please check the CSV file.");
            return;
        }

        // Prompt for username and password 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        boolean loginSuccessful = false;
        for (Employee employee : employees) {
            if (employee.username.equals(inputUsername) && employee.password.equals(inputPassword)) {
                System.out.println("Login successful! Welcome, " + employee.firstName + " " + employee.lastName);
                
                // Calculate salary and overtime
                double hoursWorked = 160;
                double overtimeHours = 10;
                OvertimeComputation overtimeComputation = new OvertimeComputation();
                double overtimePay = overtimeComputation.calculateOvertime(8, overtimeHours, employee.hourlyRate);
                double deductions = 5000;
                double salary = employee.calculateSalaryWithOvertime(hoursWorked, overtimeHours, deductions);
                
                // Display the results
                System.out.println("Total Salary: " + salary);
                System.out.println("Overtime Pay: " + overtimePay);
                
                loginSuccessful = true;
                break;
            }
        }

        if (!loginSuccessful) {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
