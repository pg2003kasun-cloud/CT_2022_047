package Q11;
import java.util.Scanner;
import java.util.Random;

public class Q11 {
    public static void main(String[] args) {
        int target = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = 0;

        while (guess != target) {
            System.out.print("Guess (1-100): ");
            guess = sc.nextInt();
            if (guess < target) System.out.println("Higher");
            else if (guess > target) System.out.println("Lower");
        }
        System.out.println("Correct!");
    }
}