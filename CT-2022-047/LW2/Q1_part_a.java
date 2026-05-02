package Q1_part_a;
import java.util.Scanner;

public class Q1_part_a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("--java Math Expressions Calculator");
        // a.Square root of B^2 +4AC

        System.out.println("Enter values for A,B,and C:");
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double resulta = Math.sqrt(Math.pow(B, 2) + 4 * A * C);
        System.out.println("Result (a):" + resulta);

        input.close();

    }
}

