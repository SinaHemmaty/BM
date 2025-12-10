import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator calculator;
    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }
    public void printPaymentsSchedule() {
        System.out.println();
        System.out.println("Payments Schedule");
        System.out.println(".........");
        for (double balances : calculator.getRemainingBalances())
            System.out.println(NumberFormat.getCurrencyInstance().format(balances));
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
