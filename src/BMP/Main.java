package BMP;

public class Main {
    public static void main(String[] args) {


        int principal = (int) Conceal.readNumber("principal : ", 1000, 1000000);
        float annualInterest = (float) Conceal.readNumber("Annual Interest : ", 1, 30);
        byte years = (byte) Conceal.readNumber("Period (years) : ", 1, 30);

        MortgageCalculator calculator = new MortgageCalculator(principal , annualInterest , years);
        MortgageReport report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentsSchedule();
    }

}
