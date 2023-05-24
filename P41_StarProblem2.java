package com.RinkitAdhana;

public class P41_StarProblem2 {
    public static void main(String[] args){
        System.out.println("Reverse right angle triangle!");
        for(int i = 1;i<=5;i++){
            for(int j =5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
