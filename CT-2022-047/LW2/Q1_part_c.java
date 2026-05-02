package Q1_part_c;
import java.util.Scanner;

public class Q1_part_c {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product of X and Y;");
        double X =input.nextDouble();
        double Y = input.nextDouble();
        double Resultc=Math.cbrt(X*Y);
        System.out.println("Result (c) is:"+Resultc);

        input.close();

    }
}
