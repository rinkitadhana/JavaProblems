package com.RinkitAdhana;

public class P22_SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,44));

    }
    public static boolean isOdd(int number){
        if(number>0){
            if(number%2!=0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static int sumOdd(int start, int end) {
        int sum = 0;
        int i;
        if (start > 0 && end > 0 && end >= start) {
            for (i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else return -1;
    }
}
