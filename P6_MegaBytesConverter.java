package com.RinkitAdhana;

public class P6_MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int withoutDecimal = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes%1024;
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
            System.out.printf(kiloBytes+" KB = "+withoutDecimal + " MB and "+remainingKiloBytes+" KB");
        }
    }
}

