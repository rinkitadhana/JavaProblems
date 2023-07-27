package section.Projects;

import java.text.NumberFormat;
import java.util.Scanner;

public class P49_MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = input.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Period (Years): ");
        int period = input.nextInt();
        double periodInMonth = period*12;
        double interestRate = annualInterestRate/1200;
        double mortgage =  principal * interestRate*(Math.pow(1+interestRate,periodInMonth)/(Math.pow(1+interestRate,periodInMonth)-1));
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ result);
    }
}
