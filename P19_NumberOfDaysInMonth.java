package com.RinkitAdhana;

public class P19_NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2022));
        System.out.println(getDaysInMonth(13,1000000));


    }
    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){

            if(year%4==0 && year%100 !=0 || year%400 ==0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }

    }
    public static int getDaysInMonth(int month, int year){
        if(month<1 || month>12 || year<1 || year>9999 ){
            return -1;
        }
        else{
            if(isLeapYear(year) && month == 2){
                return 29;
            }else{
                switch (month) {
                    case 11:
                    case 4:
                    case 6:
                    case 9:
                        return 30;
                    case 2:
                        return 28;
                    default:
                        return 31;
                }
            }
        }
    }
}
