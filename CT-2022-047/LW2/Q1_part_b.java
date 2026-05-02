package Q1_part_b;
import java.util.Scanner;

public class Q1_part_b {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Enter values fpr X and Y:");
        double X = input.nextDouble();
        double Y = input.nextDouble();
        double ResultB = Math.sqrt(X+4*Math.pow(Y,3));
        System.out.println("Result(b):"+ ResultB);

        input.close();
    }
}
