/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorPH_OOP;

public class Employee extends Person {
    private String employeeID;
    private String position;

    String username;
    String password;
    
    String birthday;
    String address;
    String phoneNumber;
    String sssNumber;
    String philhealthNumber;
    String tinNumber;
    String pagibigNumber;
    String status;
    
    private String immediateSupervisor;
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double grossSemiMonthly;
    private double hourlyRate;
    private int daysWorked;
    private int lateDays;
    private int absentDays;
    private double salary;

    public Employee() {
        super(); 
    }
    
    // Constructor
    public Employee(String firstName, String lastName, String address, String birthday, 
                    String employeeID, double hourlyRate) {
        super(firstName, lastName, address, birthday); // Call Person's constructor
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
    }
    
    public Employee(String employeeId, String lastName, String firstName, String username, String password,
                                    String birthday, String address, String phoneNumber, String sssNumber, String philhealthNumber,
                                    String tinNumber, String pagibigNumber, String status, String position, String immediateSupervisor,
                                    double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance,
                                    double grossSemiMonthlyRate, double hourlyRate) {
                        this.employeeId = employeeId;
                        this.lastName = lastName;
                        this.firstName = firstName;
                        this.username = username;
                        this.password = password;
                        this.birthday = birthday;
                        this.address = address;
                        this.phoneNumber = phoneNumber;
                        this.sssNumber = sssNumber;
                        this.philhealthNumber = philhealthNumber;
                        this.tinNumber = tinNumber;
                        this.pagibigNumber = pagibigNumber;
                        this.status = status;
                        this.position = position;
                        this.immediateSupervisor = immediateSupervisor;
                        this.basicSalary = basicSalary;
                        this.riceSubsidy = riceSubsidy;
                        this.phoneAllowance = phoneAllowance;
                        this.clothingAllowance = clothingAllowance;
                        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
                        this.hourlyRate = hourlyRate;
                    }

    // ===== Setters =====
    public void setEmployeeID(String employeeID) { this.employeeID = employeeID; }
    public void setPosition(String position) { this.position = position; }
    public void setImmediateSupervisor(String supervisor) { this.immediateSupervisor = supervisor; }
    public void setBasicSalary(double basicSalary) { this.basicSalary = basicSalary; }
    public void setRiceSubsidy(double riceSubsidy) { this.riceSubsidy = riceSubsidy; }
    public void setPhoneAllowance(double phoneAllowance) { this.phoneAllowance = phoneAllowance; }
    public void setClothingAllowance(double clothingAllowance) { this.clothingAllowance = clothingAllowance; }
    public void setGrossSemiMonthly(double grossSemiMonthly) { this.grossSemiMonthly = grossSemiMonthly; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }
    public void setDaysWorked(int daysWorked) { this.daysWorked = daysWorked; }
    public void setLateDays(int lateDays) { this.lateDays = lateDays; }
    public void setAbsentDays(int absentDays) { this.absentDays = absentDays; }

    // ===== Getters =====
    public String getEmployeeID() { return employeeID; }
    public String getPosition() { return position; }
    public String getImmediateSupervisor() { return immediateSupervisor; }
    public double getBasicSalary() { return basicSalary; }
    public double getRiceSubsidy() { return riceSubsidy; }
    public double getPhoneAllowance() { return phoneAllowance; }
    public double getClothingAllowance() { return clothingAllowance; }
    public double getGrossSemiMonthly() { return grossSemiMonthly; }
    public double getHourlyRate() { return hourlyRate; }
    public int getDaysWorked() { return daysWorked; }
    public int getLateDays() { return lateDays; }
    public int getAbsentDays() { return absentDays; } 
    public double getSalary() {
        return salary;
    }

    // ===== Government Contributions =====

    // SSS contribution based on basic salary
    public double calculateSSS() {
        if (basicSalary <= 4250) return 180.00;
        else if (basicSalary >= 24750) return 900.00;
        else return 180.00 + (Math.ceil((basicSalary - 4250) / 500) * 22.50);
    }

    // PhilHealth contribution based on basic salary
    public double calculatePhilHealth() {
        if (basicSalary <= 10000) return 300.00;
        else if (basicSalary >= 60000) return 1800.00;
        else return basicSalary * 0.03; // 3% of monthly basic salary
    }

    // Pag-IBIG contribution (2% of monthly salary, max cap at 100)
    public double calculatePagIbig() {
        double contribution = basicSalary * 0.02;
        return Math.min(contribution, 100);
    }

    // Withholding Tax based on monthly rate
    public double calculateWithholdingTax() {
        if (basicSalary <= 20832) {
            return 0.00;
        } else if (basicSalary <= 33332) {
            return (basicSalary - 20833) * 0.20;
        } else if (basicSalary <= 66666) {
            return 2500 + (basicSalary - 33333) * 0.25;
        } else if (basicSalary <= 166666) {
            return 10833 + (basicSalary - 66667) * 0.30;
        } else if (basicSalary <= 666666) {
            return 40833.33 + (basicSalary - 166667) * 0.32;
        } else {
            return 200833.33 + (basicSalary - 666667) * 0.35;
        }
    }

    // Deduction for late and absent days
    public double calculateLateDeduction() {
        double lateDeductionRate = 10.00; // deduction rate per late day
        return lateDays * lateDeductionRate;
    }

    public double calculateAbsentDeduction() {
        double absentDeductionRate = 50.00; // deduction rate per absent day
        return absentDays * absentDeductionRate;
    }

    // ===== Gross and Net Salary Computations =====

    // Calculate total allowances (rice subsidy, phone allowance, clothing allowance)
    public double calculateTotalAllowances() {
        return riceSubsidy + phoneAllowance + clothingAllowance;
    }

    // Calculate gross pay based on hours worked
    public double calculateGrossPay(double hoursWorked) {
        return hourlyRate * hoursWorked;
    }

    // Calculate total earnings (gross pay + basic salary + allowances)
    public double calculateTotalEarnings(double hoursWorked) {
        return calculateGrossPay(hoursWorked) + basicSalary + calculateTotalAllowances();
    }

    // Calculate total deductions (SSS + PhilHealth + Pag-IBIG + Tax)
    public double calculateTotalDeductions() {
        return calculateSSS() + calculatePhilHealth() + calculatePagIbig() + calculateWithholdingTax();
    }

    // ===== Calculate Salary Methods =====

    // Method for calculating salary (without overtime)
    public double calculateSalary(double hoursWorked, double deductions) {
        // Calculate total earnings (gross pay + allowances)
        double totalEarnings = calculateTotalEarnings(hoursWorked);
        // Calculate total deductions (SSS, PhilHealth, Pag-Ibig, and Tax) + any extra deductions
        double totalDeductions = calculateTotalDeductions() + deductions;
        // Return the net salary after deductions
        return totalEarnings - totalDeductions;
    }

    // Method for calculating salary with overtime
    public double calculateSalaryWithOvertime(double hoursWorked, double overtimeHours, double deductions) {
        // Calculate total earnings based on hours worked and overtime
        double totalEarnings = calculateTotalEarnings(hoursWorked);

        // Calculate overtime pay
        OvertimeComputation overtimeComputation = new OvertimeComputation();
        double overtimePay = overtimeComputation.calculateOvertime(8, overtimeHours, hourlyRate); // 8 regular hours

        // Add overtime pay to total earnings
        totalEarnings += overtimePay;

        // Calculate total deductions
        double totalDeductions = calculateTotalDeductions() + deductions + calculateLateDeduction() + calculateAbsentDeduction();

        // Return net pay (total earnings - total deductions)
        return totalEarnings - totalDeductions;
    }

    // ===== Display Methods =====

    public void displayEmployeeDetails() {
        System.out.println("=== Employee Details ===");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Position: " + position);
        System.out.println("Immediate Supervisor: " + immediateSupervisor);
        System.out.println("Address: " + getAddress());
        System.out.println("Birthday: " + getBirthday());
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Rice Subsidy: " + riceSubsidy);
        System.out.println("Phone Allowance: " + phoneAllowance);
        System.out.println("Clothing Allowance: " + clothingAllowance);
        System.out.println("Hourly Rate: " + hourlyRate);
    }

    public void displayAttendanceDetails() {
        System.out.println("=== Attendance Details ===");
        System.out.println("Days Worked: " + daysWorked);
        System.out.println("Late Days: " + lateDays);
        System.out.println("Absent Days: " + absentDays);
        System.out.println("Late Deduction: " + calculateLateDeduction());
        System.out.println("Absent Deduction: " + calculateAbsentDeduction());
    }

    // Abstract method implementation
    @Override
    public String getRole() {
        return "Employee";
    }
}
