package com.RinkitAdhana;

public class P11_TeenNumberCheck {
    public static void main(String[] args) {
        System.out.println(hasTeen(2,19,99));
    }
    public static boolean hasTeen(int num1,int num2, int num3){
        return (num1>=13 && num1<=19 || num2>=13 && num2<=19 || num3>=13 && num3<=19 );
    }
    public static boolean isTeen(int num) {
        return (num >= 13 && num <= 19);
    }
}
