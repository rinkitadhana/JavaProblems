package com.RinkitAdhana;

public class P30_LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(21,12,32));

    }
    public static boolean isValid(int number){
        return number>=10 && number<=1000;
    }
    public static boolean hasSameLastDigit(int number1,int number2,int number3){
        int lastDigit1 =0,lastDigit2 =0,lastDigit3 =0;
        if(isValid(number1)&&isValid(number2)&&isValid(number3)){
           lastDigit1 = number1%10;
           lastDigit2 = number2%10;
           lastDigit3 = number3%10;
            if(lastDigit1==lastDigit2 || lastDigit2==lastDigit3 || lastDigit3==lastDigit1){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
