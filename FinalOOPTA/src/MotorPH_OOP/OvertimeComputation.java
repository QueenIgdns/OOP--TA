/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorPH_OOP;

/**
 *
 * @author jrssc
 */
public class OvertimeComputation implements OvertimeCalculator {
    
    // Method to calculate overtime pay
    @Override
    public double calculateOvertime(double regularHours, double overtimeHours, double hourlyRate) {
        // Calculate overtime pay (at 1.5x hourly rate)
        return overtimeHours * hourlyRate * 1.5; 
    }
}
