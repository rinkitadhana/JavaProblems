import java.util.Scanner;

public class P1_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for it's Multiplication Table :");
        int num = scan.nextInt();
        int num1;
        for(num1 = 1; num1<=10; num1++){
            System.out.printf("%d x %d = %d\n",num,num1,num*num1);
        }
        System.out.println("Code Ended");

    }
}
