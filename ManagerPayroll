/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorPH_OOP;

import java.util.Scanner;

public class ManagerPayroll implements PayrollCalculator {

    private Manager manager;

    // Constructor to initialize the Manager object
    public ManagerPayroll(Manager manager) {
        this.manager = manager;
    }

    // Implementing calculatePayroll method from PayrollCalculator interface
    @Override
    public double calculatePayroll() {
        Scanner scanner = new Scanner(System.in); // Scanner to get user input

        // Get overtime hours from the user
        System.out.print("Enter overtime hours: ");
        double overtimeHours = scanner.nextDouble();

        // Get deductions from the user
        System.out.print("Enter deductions: ");
        double deductions = scanner.nextDouble();

        // Calculate salary based on input
        double salary = manager.calculateSalary(overtimeHours, deductions);

        // Example bonus for managers
        double bonus = 5000;

        // Total payroll calculation
        return salary + bonus;
    }
}
