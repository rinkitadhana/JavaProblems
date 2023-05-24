package com.RinkitAdhana;

public class P7_BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 4));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23 || hourOfDay >= 8 && hourOfDay <= 22) {
            return false;
        } else {
            return true;
        }

    }
}
