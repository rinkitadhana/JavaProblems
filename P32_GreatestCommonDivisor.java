public class P32_GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(132,1573));

    }
    public static int getGreatestCommonDivisor(int first, int second){
        int r =0;
        if(first<10 && second<10){
            return -1;
        }else{
            if(first>second){
                while(first!=0&&second!=0){
                    r=first%second;
                    second = first%r;
                }return r;
            }else{
                while(first!=0&&second!=0){
                    r=second%first;
                    first = second%r;
                }return r;
            }

        }
    }
}
