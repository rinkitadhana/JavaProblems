package com.RinkitAdhana;
import java.util.Scanner;

public class P36_ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        for(counter = 1; counter<=5; counter++){
            System.out.println("Enter number #"+counter+":");
            int number = sc.nextInt();
            if(number<0){
                System.out.println("Invalid number");
            }else{
            sum = number + sum;
            }
        }
        System.out.println("Sum of all numbers is: nt "+sum);

    }
}
