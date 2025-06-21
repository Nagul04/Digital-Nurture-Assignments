package app;

public class Main {
    public static void main(String[] args) {
        double initialAmount = 10000;     
        double annualGrowthRate = 0.10;   
        int forecastYears = 10;

        ForecastUtil.printForecast(initialAmount, annualGrowthRate, forecastYears);
    }
}
