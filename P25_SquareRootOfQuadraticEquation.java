public class P25_SquareRootOfQuadraticEquation {
    public static void main(String[] args) {
        rootsOfQuadraticEquation(2,3,4);
    }
   public static void rootsOfQuadraticEquation(double a,double b,double c){
       double root1,root2,realPart,imgPart;
        double discriminant = b*b-4*a*c;
        if(discriminant>0){
          root1 = (-b + Math.sqrt(discriminant))/(2*a);
          root2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("First root = "+root1);
            System.out.println("Second root = "+root2);
        }else if(discriminant==0){
            root1=root2=-b/(2*a);
            System.out.println("Both roots will be same = "+root1);
        }else{
            realPart = -b/(2*a);
            imgPart = Math.sqrt(-discriminant)/(2*a);
            System.out.println("First root = "+realPart);
            System.out.println("Second root = "+imgPart);
        }

   }
}
