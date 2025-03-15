/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorPH_OOP;

/**
 *
 * @author jrssc
 */
public class DeductionCalculator {

    private double basicSalary;

    public DeductionCalculator(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // --- SSS Computation ---
    public double computeSSS() {
        double[][] sssTable = {
            {0, 3249.99, 135},
            {3250, 3749.99, 157.5},
            {3750, 4249.99, 180},
            {4250, 4749.99, 202.5},
            {4750, 5249.99, 225},
            {5250, 5749.99, 247.5},
            {5750, 6249.99, 270},
            {6250, 6749.99, 292.5},
            {6750, 7249.99, 315},
            {7250, 7749.99, 337.5},
            {7750, 8249.99, 360},
            {8250, 8749.99, 382.5},
            {8750, 9249.99, 405},
            {9250, 9749.99, 427.5},
            {9750, 10249.99, 450},
            {10250, 10749.99, 472.5},
            {10750, 11249.99, 495},
            {11250, 11749.99, 517.5},
            {11750, 12249.99, 540},
            {12250, 12749.99, 562.5},
            {12750, 13249.99, 585},
            {13250, 13749.99, 607.5},
            {13750, 14249.99, 630},
            {14250, 14749.99, 652.5},
            {14750, 15249.99, 675},
            {15250, 15749.99, 697.5},
            {15750, 16249.99, 720},
            {16250, 16749.99, 742.5},
            {16750, 17249.99, 765},
            {17250, 17749.99, 787.5},
            {17750, 18249.99, 810},
            {18250, 18749.99, 832.5},
            {18750, 19249.99, 855},
            {19250, 19749.99, 877.5},
            {19750, 20249.99, 900},
            {20250, 20749.99, 922.5},
            {20750, 21249.99, 945},
            {21250, 21749.99, 967.5},
            {21750, 22249.99, 990},
            {22250, 22749.99, 1012.5},
            {22750, 23249.99, 1035},
            {23250, 23749.99, 1057.5},
            {23750, 24249.99, 1080},
            {24250, 24749.99, 1102.5},
            {24750, Double.MAX_VALUE, 1125}
        };

        for (double[] range : sssTable) {
            if (basicSalary >= range[0] && basicSalary <= range[1]) {
                return range[2];
            }
        }
        return 0;
    }

    // --- Pag-IBIG Computation ---
    public double computePagIbig() {
        if (basicSalary >= 1000 && basicSalary <= 1500) {
            return basicSalary * 0.01;
        } else if (basicSalary > 1500) {
            return basicSalary * 0.02;
        }
        return 0; // No contribution below 1000
    }

    // --- PhilHealth Computation ---
    public double computePhilHealth() {
        if (basicSalary <= 10000) {
            return 300;
        } else if (basicSalary < 60000) {
            double premium = basicSalary * 0.03;
            return Math.min(Math.max(premium, 300), 1800); // Ensure within bounds
        } else {
            return 1800;
        }
    }

    // --- Tax Computation ---
    public double computeTax() {
        if (basicSalary <= 20832) {
            return 0;
        } else if (basicSalary < 33333) {
            return (basicSalary - 20833) * 0.20;
        } else if (basicSalary < 66667) {
            return 2500 + (basicSalary - 33333) * 0.25;
        } else if (basicSalary < 166667) {
            return 10833 + (basicSalary - 66667) * 0.30;
        } else if (basicSalary < 666667) {
            return 40833.33 + (basicSalary - 166667) * 0.32;
        } else {
            return 200833.33 + (basicSalary - 666667) * 0.35;
        }
    }

    // --- Total Deductions ---
    public double getTotalDeductions() {
        return computeSSS() + computePagIbig() + computePhilHealth() + computeTax();
    }

    // --- Print Detailed Breakdown ---
    public void printDeductionBreakdown() {
        System.out.println("===== Deduction Breakdown =====");
        System.out.printf("SSS: %.2f%n", computeSSS());
        System.out.printf("Pag-IBIG: %.2f%n", computePagIbig());
        System.out.printf("PhilHealth: %.2f%n", computePhilHealth());
        System.out.printf("Withholding Tax: %.2f%n", computeTax());
        System.out.printf("Total Deductions: %.2f%n", getTotalDeductions());
        System.out.println("===============================");
    }
}
