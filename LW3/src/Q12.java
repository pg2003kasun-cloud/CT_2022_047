package Q12;
import java.util.Scanner;

public class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Word to replace: ");
        String target = sc.next();
        System.out.print("Replacement: ");
        String replacement = sc.next();

        System.out.println("Result: " + sentence.replace(target, replacement));
    }
}