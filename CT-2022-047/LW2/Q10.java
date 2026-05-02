package  Q10;
import java.util.Scanner;
public class Q10 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter loan amount:");
        double loanAmount = scanner.nextDouble();

        char rate ='%';
        System.out.printf("Enter annual interest rate %s:",rate);
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter loanperiod in years:");
        int loanperiod = scanner.nextInt();

        int MONTHS_IN_YEAR=12;

        double monthlyInterestRate = annualInterestRate/100.0/MONTHS_IN_YEAR;
        double numberOfPayments=loanperiod*MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount*monthlyInterestRate)/(1-Math.pow(1/(1+monthlyInterestRate),numberOfPayments));
        double TotalPayment = monthlyPayment*numberOfPayments;

        System.out.printf("your monthlyPayment is:%.2f and TotalPayment for %d is:%.2f",monthlyPayment,loanperiod,TotalPayment);

       scanner.close();
    }
}
