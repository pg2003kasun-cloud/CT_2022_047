package Q4;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Q4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Bodyweight:");
        double Bodyweight = scanner.nextDouble();
        double calories = Bodyweight*19;
        //System.out.println("Number of calories you need in one day is:"+calories);
        System.out.printf(" your bodyweight is %.2f kg so you need %.2f calories in one day",Bodyweight,calories );

        scanner.close();

    }
}
