package Q5;
import java.util.Scanner;

public class Q5 {
    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the temperature in Fahrenheit:");
        double fahrenheit= scanner.nextDouble();
        double celcius= (5/9.0)*(fahrenheit-32);
        System.out.println("temperature in celsius is:"+celcius);
        System.out.printf("%.2f degrees fahrenheit is %.2f degrees celsius.",fahrenheit,celcius);

        scanner.close();
    }
}
