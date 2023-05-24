package com.RinkitAdhana;

public class P14_MinutesToYearAndDaysCalculator {
    public static void main(String[] args) {
      printYearsAndDays(5363673);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
            long years = minutes/525600;
            long forDays = minutes%525600;
            long days = forDays/1440;
            System.out.println(minutes+" min = "+years+" y and "+days+" d");
        }
    }
}
