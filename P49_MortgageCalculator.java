import java.text.NumberFormat;
import java.util.Scanner;

public class P49_MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal =0;
        double annualInterestRate = 0;
        double periodInMonth = 0;
        double interestRate = 0;
        while (true){
            System.out.print("Principal(1k-1M): ");
            principal = input.nextDouble();
            if (principal>=1000&&principal<=1000000)
                break;
        }
        while(true){
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = input.nextDouble();
            if (annualInterestRate>=1&&annualInterestRate<=30) {
                interestRate = annualInterestRate / 1200;
                break;
            }
        }
        while(true){
            System.out.print("Period (Years): ");
            int period = input.nextInt();
            if (period>=1&&period<=30) {
                periodInMonth = period * 12;
                break;
            }

        }
        double mortgage =  principal * interestRate*(Math.pow(1+interestRate,periodInMonth)/(Math.pow(1+interestRate,periodInMonth)-1));
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ result);
    }
}
