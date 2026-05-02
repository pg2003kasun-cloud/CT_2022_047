package Q7;
import java.util.Scanner;

public class Q7 {
    static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your weight in KG:");
        int w = input.nextInt();
        System.out.println("Enter your height in centimeters:");
        int h =input.nextInt();

        double BMI = w/Math.pow((h/100.0),2);
// A BMI of about 20 to 25 is considered "normal"
        if (BMI>=20 && BMI<=25) {
            System.out.printf("Norml");
// optional part
        }else
            System.out.println("not healthy");

    input.close();

    }
}
