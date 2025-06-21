package app;

public class ForecastUtil {
    public static void printForecast(double initialAmount, double growthRate, int years) {
        System.out.println("Initial Amount: ₹" + initialAmount);
        System.out.println("Annual Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Forecast for " + years + " years:");

        for (int i = 0; i <= years; i++) {
            double value = FinancialForecast.calculateFutureValue(initialAmount, growthRate, i);
            System.out.printf("Year %d: ₹%.2f%n", i, value);
        }
    }
}
