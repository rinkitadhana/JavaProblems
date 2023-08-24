public class P9_decimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(2.2322,2.2223));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int firstCheck = (int)(num1*1000);
        int secondCheck = (int)(num2*1000);
      if(firstCheck-secondCheck==0){
          return true;
      }else{
          return false;
      }
    }
}
