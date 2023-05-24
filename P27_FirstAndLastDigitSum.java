package com.RinkitAdhana;

public class P27_FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(2242));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }else if(number<=9){
            return number+number;
        }
        else{
            int lastNumber = number%10;
            while(number>9){
                number /=10;

            }

            return number + lastNumber;
        }
    }
}
