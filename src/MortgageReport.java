import java.text.NumberFormat;

public class MortgageReport {
    private static MortgageCalculator calculator;
    public static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("Mortgage : ");
        System.out.println(".........");
        System.out.println("Monthly Payments" + mortgageFormatted);
    }

    public static void printPaymentsSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("Payments Schedule");
        System.out.println(".........");
        for(short month = 1; month < years * Main.MONTHS_IN_YEAR; month ++){
            double balance = calculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
