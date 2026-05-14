package Q10;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(text).reverse().toString();
        System.out.println(text.equals(rev) ? "Palindrome" : "Not a Palindrome");
    }
}