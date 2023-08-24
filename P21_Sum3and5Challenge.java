public class P21_Sum3and5Challenge {
    public static void main(String[] args) {
        int countOfMatches =0;
        int sumOfMatches =0;
        for(int i =1; i<=100; i++) {
            if(i%3==0 && i%5==0){
                countOfMatches++;
                sumOfMatches +=i;
                System.out.println("Found a Match =" + i);
            }
            if(countOfMatches==5){
                break;
            }
        }
        System.out.println(("Sum = " + sumOfMatches));
    }
}
