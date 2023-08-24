import java.text.NumberFormat;
import java.util.Scanner;

class Console {
    private static final Scanner scan = new Scanner(System.in);
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            value = scan.nextDouble();
            if (min <= value && value <= max)
                break;
            System.out.println("Enter a number between " + min + " and " + max);
        }
        return value;
    }
}
class MortgageReport {
    private static MortgageCalculator calculator;
    private final NumberFormat currencyInstance;

    public MortgageReport(MortgageCalculator calculator) {
        MortgageReport.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currencyInstance.format(balance));
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payment: " + mortgageFormatted);
    }
}

class MortgageCalculator {
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;
    private final int principal;
    private final float annualInterest;
    private final byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        float months = getMonths();
        return principal * monthlyInterest * (Math.pow(1 + monthlyInterest, months) / (Math.pow(1 + monthlyInterest, months) - 1));
    }


    public double calculateBalance(short numberOfPayments) {

        float monthlyInterest = getMonthlyInterest();
        float months = getMonths();
        return principal * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, months)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double[] getRemainingBalances() {
        var balances = new double[getMonths()];
        for (short month = 1; month <= balances.length; month++) {
            balances[month - 1] = calculateBalance(month);
        }
        return balances;
    }

    private int getMonths() {
        return years * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest() {
        return annualInterest / MONTHS_IN_YEAR / PERCENT;
    }
}
public class P53_MoshMortgageUsingOOps {
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal", 1_000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest", 1, 30);
        byte years = (byte) Console.readNumber("Years", 1, 30);
        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}

