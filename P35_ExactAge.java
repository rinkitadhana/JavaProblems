import java.util.Scanner;

public class P35_ExactAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, What's Your Name ?");
        String name = sc.nextLine();
        System.out.println("Hello "+name+" nice to meet you !");
        System.out.println("What's Today's Date ?");
        System.out.print("Day: ");int day = sc.nextInt();
        System.out.print("Month: ");int month = sc.nextInt();
        System.out.print("Year: ");int year = sc.nextInt();
        System.out.println("What's Your Date of Birth ?");
        System.out.print("Day: ");int dayOfBirth = sc.nextInt();
        System.out.print("Month: ");int monthOfBirth = sc.nextInt();
        System.out.print("Year: ");int yearOfBirth = sc.nextInt();

        String upperCaseName = name.toUpperCase();
        char firstLetter = upperCaseName.charAt(0);
        System.out.println("These Astrology Signs are not Accurate!");
        switch (firstLetter) {
            case 'A', 'L', 'E', 'I', 'O':
                System.out.println("Your Astrology Sign is Aries(Mesha).");
                break;
            case 'B', 'V', 'U', 'W':
                System.out.println("Your Astrology Sign is Taurus(Vrishabha).");
            case 'K', 'Q', 'C':
                System.out.println("Your Astrology Sign is Gemini(Mithun).");
                break;
            case 'H':
                System.out.println("Your Astrology Sign is Cancer(Karka).");
                break;
            case 'M':
                System.out.println("Your Astrology Sign is Leo(Simha).");
                break;
            case 'P':
                System.out.println("Your Astrology Sign is Vigro(Knaya).");
                break;
            case 'R', 'T':
                System.out.println("Your Astrology Sign is Libra(Tula).");
                break;
            case 'N', 'Y':
                System.out.println("Your Astrology Sign is Scorpius(Vruschika).");
                break;
            case 'F':
                System.out.println("Your Astrology Sign is Sagittarius(Dhanu).");
                break;
            case 'J':
                System.out.println("Your Astrology Sign is Capricorn(Makar).");
                break;
            case 'G', 'S':
                System.out.println("Your Astrology Sign is Aquarius(Kumbha).");
                break;
            case 'D', 'Z':
                System.out.println("Your Astrology Sign is Pisces(Meena).");
                break;
            default:
                System.out.println("You are Adopted!");
                break;
           }
        }


    }