/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_t2_payroll;

/**
 *
 * @author Sylani
 */
public class EmployeePayroll extends EmployeeInfo {

    public EmployeePayroll(String employeeNo, String lastName, String firstName, String workedHours, String basicSalary, String hourlyRate, String grossIncome, String sssDeduction, String philHealthDeduction, String pagibigDeduction, String withholdingTax, String coveredMonth, String coveredYear, String benefits, String totalDeductions, String takeHomePay) {
        super(employeeNo, lastName, firstName, workedHours, basicSalary, hourlyRate, grossIncome, sssDeduction, philHealthDeduction, pagibigDeduction, withholdingTax, coveredMonth, coveredYear, benefits, totalDeductions, takeHomePay);
    }
  

    

    // Getters and Setters
    @Override
    public String getEmployeeNo() {
        return employeeNo;
    }

    @Override
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getWorkedHours() {
        return workedHours;
    }

    @Override
    public void setWorkedHours(String workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public String getBasicSalary() {
        return basicSalary;
    }

    @Override
    public void setBasicSalary(String basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public void setHourlyRate(String hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getGrossIncome() {
        return grossIncome;
    }

    @Override
    public void setGrossIncome(String grossIncome) {
        this.grossIncome = grossIncome;
    }

    @Override
    public String getSssDeduction() {
        return sssDeduction;
    }

    @Override
    public void setSssDeduction(String sssDeduction) {
        this.sssDeduction = sssDeduction;
    }

    @Override
    public String getPhilHealthDeduction() {
        return philHealthDeduction;
    }

    @Override
    public void setPhilHealthDeduction(String philHealthDeduction) {
        this.philHealthDeduction = philHealthDeduction;
    }

    @Override
    public String getPagibigDeduction() {
        return pagibigDeduction;
    }

    @Override
    public void setPagibigDeduction(String pagibigDeduction) {
        this.pagibigDeduction = pagibigDeduction;
    }

    @Override
    public String getWithholdingTax() {
        return withholdingTax;
    }

    @Override
    public void setWithholdingTax(String withholdingTax) {
        this.withholdingTax = withholdingTax;
    }

    @Override
    public String getCoveredMonth() {
        return coveredMonth;
    }

    @Override
    public void setCoveredMonth(String coveredMonth) {
        this.coveredMonth = coveredMonth;
    }

    @Override
    public String getCoveredYear() {
        return coveredYear;
    }

    @Override
    public void setCoveredYear(String coveredYear) {
        this.coveredYear = coveredYear;
    }

    @Override
    public String getBenefits() {
        return benefits;
    }

    @Override
    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    @Override
    public String getTotalDeductions() {
        return totalDeductions;
    }

    @Override
    public void setTotalDeductions(String totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    @Override
    public String getTakeHomePay() {
        return takeHomePay;
    }

    @Override
    public void setTakeHomePay(String takeHomePay) {
        this.takeHomePay = takeHomePay;
    }

    
}