/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorPH_OOP;
/**
 *
 * @author jrssc
 */
public class RegularEmployeePayroll implements PayrollCalculator {
    private Employee employee;
    private double hoursWorked;
    private double deductions;

    public RegularEmployeePayroll(Employee employee, double hoursWorked, double deductions) {
        this.employee = employee;
        this.hoursWorked = hoursWorked;
        this.deductions = deductions;
    }

    @Override
    public double calculatePayroll() {
        // Now it calls the newly implemented calculateSalary method
        return employee.calculateSalary(hoursWorked, deductions);
    }
}
