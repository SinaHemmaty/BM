import java.text.NumberFormat;
import java.time.Period;

public class MortgageReport {
    private MortgageCalculator calculator;

    public void printPaymentsSchedule() {
        System.out.println();
        System.out.println("Payments Schedule");
        System.out.println(".........");
        
        for(short month = 1; month < calculate.getYears() * Main.MONTHS_IN_YEAR; month ++){
            double balance = calculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("Mortgage : ");
        System.out.println(".........");
        System.out.println("Monthly Payments" + mortgageFormatted);
    }

}
