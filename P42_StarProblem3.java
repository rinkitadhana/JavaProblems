public class P42_StarProblem3 {
    public static void main(String[] args){
        System.out.println("Flip to left side!");
        for(int i = 1;i<=5;i++){        // rows
            for(int j =i;j<5;j++){      // space
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){      // columns
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
