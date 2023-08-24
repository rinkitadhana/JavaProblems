public class P29_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(21,33));
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        } else {
            int rem1 = num1%10;
            int rem2 = num2%10;
            int div1 = num1/10;
            int div2 = num2/10;
            if(rem1==rem2||rem1==div2||div1==rem2||div1==div2){
                return true;
            }else{
                return false;
            }
        }
    }
}
