package Q8;
import java.util.Scanner;

public class Q8 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        int radius = input.nextInt();
        double PI=3.14;
        //compute the volume using the formula

        double volume=(4/3)*PI*Math.cbrt(radius*3);
        System.out.printf("The Volume of the sphere is:%.2f",volume);
    }
}
