package Q9;
import java.util.Scanner;

public class Q9 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial inverstment amont(p):");
        double P = input.nextDouble();

        System.out.println("Enter  the annual interest rate in precent (R):");
        double R = input.nextDouble();

        System.out.println("Enter the number of years(N)");
        int N  = input.nextInt();

        double amount = P*Math.pow(1+(R/100.0),N);
        //display the final amount earned

        System.out.printf("After %d years,your inverstment will grow up  to:%.2f dollars\n",N,amount);

        input.close();

    }
}
