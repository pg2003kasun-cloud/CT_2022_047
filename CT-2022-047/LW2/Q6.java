package  Q6;
import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input the year a person is born

        System.out.println("Enter your birth year:");
        int birthyear =input.nextInt();

        // Calculate the age (current year 2026-birthyear)
        int currentyear = 2026;
        int age = currentyear-birthyear;

        System.out.printf("You were born in %d will be (are) %d this year:",birthyear,age);

        input.close();
    }
}