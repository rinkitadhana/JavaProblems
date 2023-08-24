public class P28_EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(22));

    }
    public static int getEvenDigitSum(int number){
    int remainder =0,sum =0;
        if(number<0){
            return -1;
        }else{
            while(number>0){
                remainder = number%10;
                number = number/10;
                if(remainder%2==0){
                    sum = sum + remainder;
                }
            }
            return sum;

        }
    }
}
