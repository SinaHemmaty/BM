public class Main {
    final static byte MONTHS_IN_YEAR = 12 ;
    final static byte PERCENT = 100 ;

    public static void main(String[] args) {

        int principal = (int) Conceal.readNumber("principal : ", 1000, 1000000);
        float annualInterest = (float) Conceal.readNumber("Annual Interest : ", 1, 30);
        byte years = (byte) Conceal.readNumber("Period (years) : ", 1, 30);

        MortgageReport.printMortgage();

        new MortgageReport().printPaymentsSchedule(principal, annualInterest, years);

    }

}
