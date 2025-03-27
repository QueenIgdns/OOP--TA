/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_t2_payroll;

/**
 *
 * @author sales
 */
abstract class EmployeeInfo {
    
    
    String employeeNo;
    String lastName;
    String firstName;
    String workedHours;
    String basicSalary;
    String hourlyRate;
    String grossIncome;
    String sssDeduction;
    String philHealthDeduction;
    String pagibigDeduction;
    String withholdingTax;
    String coveredMonth;
    String coveredYear;
    String benefits;
    String totalDeductions;
    String takeHomePay;

    // Constructor
    public EmployeeInfo(
            String employeeNo, String lastName, 
            String firstName, String workedHours, 
            String basicSalary, String hourlyRate, 
            String grossIncome, String sssDeduction, 
            String philHealthDeduction, String pagibigDeduction, 
            String withholdingTax, String coveredMonth, 
            String coveredYear, String benefits, 
            String totalDeductions, String takeHomePay) {
        this.employeeNo = employeeNo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.workedHours = workedHours;
        this.basicSalary = basicSalary;
        this.hourlyRate = hourlyRate;
        this.grossIncome = grossIncome;
        this.sssDeduction = sssDeduction;
        this.philHealthDeduction = philHealthDeduction;
        this.pagibigDeduction = pagibigDeduction;
        this.withholdingTax = withholdingTax;
        this.coveredMonth = coveredMonth;
        this.coveredYear = coveredYear;
        this.benefits = benefits;
        this.totalDeductions = totalDeductions;
        this.takeHomePay = takeHomePay;
    }
    
    public abstract String getEmployeeNo();

    public abstract void setEmployeeNo(String employeeNo);

    public abstract String getLastName();

    public abstract  void setLastName(String lastName);

    public abstract String getFirstName();

    public abstract void setFirstName(String firstName);

    public abstract String getWorkedHours();

    public abstract void setWorkedHours(String workedHours);

    public abstract String getBasicSalary();

    public abstract void setBasicSalary(String basicSalary);

    public abstract String getHourlyRate();

    public abstract void setHourlyRate(String hourlyRate);

    public abstract String getGrossIncome();

    public abstract void setGrossIncome(String grossIncome);

    public abstract String getSssDeduction();

    public abstract void setSssDeduction(String sssDeduction);

    public abstract String getPhilHealthDeduction();

    public abstract void setPhilHealthDeduction(String philHealthDeduction);

    public abstract String getPagibigDeduction();

    public abstract void setPagibigDeduction(String pagibigDeduction);

    public abstract String getWithholdingTax();

    public abstract void setWithholdingTax(String withholdingTax);

    public abstract String getCoveredMonth();

    public abstract void setCoveredMonth(String coveredMonth);

    public abstract String getCoveredYear();

    public abstract void setCoveredYear(String coveredYear);

    public abstract String getBenefits();

    public abstract void setBenefits(String benefits);

    public abstract String getTotalDeductions();

    public abstract void setTotalDeductions(String totalDeductions);

    public abstract String getTakeHomePay();

    public abstract void setTakeHomePay(String takeHomePay);
    
}
