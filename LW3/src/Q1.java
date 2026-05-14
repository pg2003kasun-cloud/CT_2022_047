import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st integers: ");
        int a = input.nextInt();
        System.out.println("Enter 2nd integers: ");
        int b = input.nextInt();
        System.out.println("Enter 3rd integers: ");
        int c = input.nextInt();

        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        System.out.println("The smallest number is: " + smallest);
    }
}