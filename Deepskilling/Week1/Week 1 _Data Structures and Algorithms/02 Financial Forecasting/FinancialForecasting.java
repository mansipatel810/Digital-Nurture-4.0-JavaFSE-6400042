import java.util.Scanner;

public class FinancialForecasting {

    public static double calculateFutureRevenue(double currentRevenue, double growthRate, int years) {
        return currentRevenue * Math.pow((1 + growthRate / 100), years);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current annual revenue (in ₹): ");
        double revenue = input.nextDouble();

        System.out.print("Enter expected annual growth rate (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter number of years for forecasting: ");
        int years = input.nextInt();

        double forecast = calculateFutureRevenue(revenue, rate, years);

        System.out.printf("Projected revenue after %d years: ₹%.2f\n", years, forecast);
    }
}
