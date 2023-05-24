package com.RinkitAdhana;

public class p12_FeetToCentimeter_OverloadedMethodChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeter(6,2));
    }
    public static double convertToCentimeters(int heightInInches){
        return heightInInches*2.54;
    }
    public static double convertToCentimeter(int heightInFeet, int heightInInches){
        int totalHeightInInches = heightInFeet*12 + heightInInches;
        return convertToCentimeters(totalHeightInInches);
    }
}
