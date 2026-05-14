package Q3;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a power of 10 (Ex: 6, 9, 12): ");
        int power = scanner.nextInt();

        String word; // 1. Declare the variable first
        switch (power) {
            case 6:
                word = "Million";
                break; // 2. Explicit break prevents "fall-through"
            case 9:
                word = "Billion";
                break;
            case 12:
                word = "Trillion";
                break;
            case 15:
                word = "Quadrillion";
                break;
            case 18:
                word = "Quintillion";
                break;
            case 21:
                word = "Sextillion";
                break;
            case 30:
                word = "Nonillion";
                break;
            case 100:
                word = "Googol";
                break;
            default:
                word = "No corresponding word found";
                break;
        }

        System.out.println(word);
    }
}