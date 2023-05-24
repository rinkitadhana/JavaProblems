package com.RinkitAdhana;

public class P26_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
    public static boolean isPalindrome(int number){
        int remainder,s=0;
        int c=number;
        while(number!=0){
            remainder=number%10;
            s=(s*10)+remainder;
            number=number/10;
        }
        if(c==s){
            return true;
        }else {
            return false;
        }
    }
}
