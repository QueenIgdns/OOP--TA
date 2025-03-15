/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorPH_OOP;

/**
 *
 * @author jrssc
 */
import java.time.LocalDateTime;
import java.time.Duration;

public class Attendance {
    private String username;
    private LocalDateTime clockInTime;
    private LocalDateTime clockOutTime;
    private int workedHours; // Total hours worked
    private int overtimeHours; // Overtime hours worked

    public Attendance(String username) {
        this.username = username;
        this.clockInTime = null;
        this.clockOutTime = null;
        this.workedHours = 0;
        this.overtimeHours = 0;
    }

    // Methods to track clock-in and clock-out times
    public void clockIn() {
        clockInTime = LocalDateTime.now();
    }

    public void clockOut() {
        clockOutTime = LocalDateTime.now();
        calculateWorkingHours();
    }

    private void calculateWorkingHours() {
        if (clockInTime != null && clockOutTime != null) {
            Duration duration = Duration.between(clockInTime, clockOutTime);
            workedHours = (int) duration.toHours();
            applyOvertime();
        }
    }

    // Apply overtime if hours worked exceed the standard work hours (e.g., 8 hours/day)
    private void applyOvertime() {
        int standardHours = 8; // Assuming 8 hours is the standard workday
        if (workedHours > standardHours) {
            overtimeHours = workedHours - standardHours;
        } else {
            overtimeHours = 0;
        }
    }

    // Getters for attendance data
    public String getUsername() {
        return username;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    // Method to calculate employee's payroll based on worked hours
    public double calculatePayroll(Employee employee) {
        double hourlyRate = employee.getSalary() / 160; // Assuming 160 hours/month
        double overtimeRate = hourlyRate * 1.5; // Overtime rate (1.5x the hourly rate)
        double regularPay = workedHours * hourlyRate;
        double overtimePay = overtimeHours * overtimeRate;
        return regularPay + overtimePay;
    }
}
