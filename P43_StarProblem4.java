public class P43_StarProblem4 {
    public static void main(String[] args){
        System.out.println("Flip to right side!");
        for(int i = 1;i<=5;i++){        // rows
            for(int j =1;j<i;j++){      // space
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--){      // columns
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
