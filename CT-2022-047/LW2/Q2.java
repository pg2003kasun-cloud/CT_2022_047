package Q2;
import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter centimeters:");
        double cm=scanner.nextDouble();

        double totalinches = cm/2.45;
        int feet=(int)(totalinches/12);
        double remaininginches = totalinches%12;
        System.out.printf("%.2f cm is %d feet and %.2f inches\n",cm,feet,remaininginches);
       // System.out.println(cm+"cm is\t"+feet+"\tfeet and "+remaininginches+"\tinches");

        scanner.close();
    }
}
