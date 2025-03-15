package MotorPH_OOP;

/**
 *
 * @author jrssc
 */
public class Manager extends Person {
    private String employeeNumber;
    private double basicSalary;
    private String position;
    private String immediateSupervisor;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double grossSemiMonthly;

    // Constructor
    public Manager(String firstName, String lastName, String address, String birthday, 
                   String employeeNumber, double basicSalary, String position, String supervisor, 
                   double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossSemiMonthly) {
        super(firstName, lastName, address, birthday); // Call Person constructor
        this.employeeNumber = employeeNumber;
        this.basicSalary = basicSalary;
        this.position = position;
        this.immediateSupervisor = supervisor;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossSemiMonthly = grossSemiMonthly;
    }

    // Getters and Setters 
    // Override role
    @Override
    public String getRole() {
        return "Manager";
    }

    // Calculate Salary Method
    public double calculateSalary(double overtimeHours, double deductions) {
        double overtimePay = overtimeHours * 100; // Example overtime rate
        double totalAllowances = riceSubsidy + phoneAllowance + clothingAllowance;
        double grossIncome = basicSalary + overtimePay + totalAllowances;
        double netIncome = grossIncome - deductions;
        return netIncome;
    }
}
