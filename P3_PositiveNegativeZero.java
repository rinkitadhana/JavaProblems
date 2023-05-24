package com.RinkitAdhana;

public class P3_PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(69);
    }
    public static void checkNumber(int number){
        if(number>0){
            System.out.println("Positive");
        }else if (number<0){
            System.out.println("Negative");
        }else if (number == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Error");
        }
    }
}
