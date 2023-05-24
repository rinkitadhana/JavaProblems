package com.RinkitAdhana;

public class P23_EvenNumber_WhileLoopChallenge {
    public static void main(String[] args) {
        int i = 5;
        while(i<= 20){
            if(isEvenNumber(i)== true){
                System.out.println(i);
            }
            i++;
        }
    }
    public static boolean isEvenNumber(int number){
        if(number % 2==0){
            return true;
        }else{
            return false;
        }

    }
}
