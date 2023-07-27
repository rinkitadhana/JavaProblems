import java.util.Scanner;
import java.util.Random;
public class S_RPS {
    public static void main(String[] args) {
        System.out.println("Welcome to 'THE ROCK PAPER AND SCISSORS'");
        System.out.println("Enter: '0' for Rock \n       '1' for Paper \n       '2' for Scissors ");
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Enter Your Number:");
        int x = sc.nextInt();
        int y = ran.nextInt(2);

        if (x==y) {
            System.out.println("Computer selected the same number as you\nMATCH DRAW");
        }
        else if (x==0&&y==1) {
            System.out.println("Computer has selected 'PAPER'\nCOMPUTER WON\nYOU LOST");
        }
        else if (x==0&&y==2) {
            System.out.println("Computer has selected 'SCISSOR'\nYOU WON\nCOMPUTER LOST");
        }
        else if (x==1&&y==0) {
            System.out.println("Computer has selected 'ROCK'\nYOU WON\nCOMPUTER LOST");
        }
        else if (x==1&&y==2) {
            System.out.println("Computer has selected 'SCISSOR'\nCOMPUTER WON\nYOU LOST");
        }
        else if (x==2&&y==0) {
            System.out.println("Computer has selected 'ROCK'\nCOMPUTER WON\nYOU LOST");
        }
        else if (x==2&&y==1) {
            System.out.println("Computer has selected 'PAPER'\nYOU WON\nCOMPUTER LOST");
        }
        else {
            System.out.println("Are You Dumb or Wottttt?\nSelect the number from 0,1,2.");
        }
        System.out.println("PLAY AGAIN");
        System.out.println("");
        System.out.println("MADE BY RINKIT ADHANA");

    }
}

