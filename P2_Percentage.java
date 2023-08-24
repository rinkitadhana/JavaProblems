import java.util.Scanner;
public class P2_Percentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my code for Percentage \nHope you'll like it");
        System.out.println("Enter the number of subjects :");
        int numberOfSubjects = scan.nextInt();
        float marks = 0;
        float sum = 0;
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.printf("Enter the marks of %d subject :\n", i);
            marks = scan.nextInt();
            if (marks < 0) {
                System.out.println("Invalid Number!");
                sum = 1;
                break;
            } else {
                sum += marks;
            }
        }
        if(sum!=1) {
            System.out.println("Enter the Maximum Number can be obtained : ");
            int totalNumberCanBeObtained = scan.nextInt();
            double percentage = (sum / totalNumberCanBeObtained) * 100;
            if (totalNumberCanBeObtained < sum) {
                System.out.println("Error");
            } else {
                System.out.printf("Your Percentage is %.2f\n",percentage);
            }
            if (percentage < 33.00 && percentage >= 0) {
                System.out.println("You are not Qualified!");
            } else if (percentage < 100.00 && percentage >= 33.00) {
                System.out.println("You are Qualified!");
            }
        }else{
            System.out.println("You have entered a Invalid Number. So, code will not Execute Anymore");
        }
    }
}

