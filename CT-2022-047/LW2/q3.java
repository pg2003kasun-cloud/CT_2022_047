package Q3;
import java.util.Scanner;

public class q3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius:");
        double cel = scanner.nextDouble();
        double fahrenheit=(1.8*cel)+32;
        //System.out.printf("temperature is:%.2f",far);
        System.out.println("Temperature in fahrenheit:"+fahrenheit);

        scanner.close();
    }
}
