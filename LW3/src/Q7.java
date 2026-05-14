package Q7;
import java.util.Scanner;

public class Q7{
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            int n = sc.nextInt();
            if (n < 0) break;
            System.out.println("Digits: " + countDigits(n));
        }
    }
}