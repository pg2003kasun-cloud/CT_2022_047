package Q1_part_d;
import java.util.Scanner;

public class Q1_part_d {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of circle:");

         double radius = input.nextDouble();
         double Resultd=Math.PI*(Math.pow(radius,2));
        System.out.println("Area of the circle is:"+Resultd);
        System.out.printf("Area of the circle is:%.2f",Resultd);

        input.close();
    }
}
