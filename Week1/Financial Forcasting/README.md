# Exercise 4 – Financial Forecasting

## Objective
Use recursion to build a financial forecast tool that projects future value based on an initial investment and annual growth rate.

## Description
This Java project uses a recursive algorithm to calculate the future value of an investment over a number of years. It prints the projected amount for each year.

## Files
- `FinancialForecast.java` – Contains the recursive method
- `ForecastUtil.java` – Utility to print forecast values
- `Main.java` – Main class to run the tool

## Output
Displays the future value for each year based on the initial amount and growth rate.

## Time Complexity

- Recursive Function Time Complexity: O(n)
- Each call depends on the result of the previous year, leading to linear depth of recursion.

## Optimization

- Since the computation is linear and does not overlap like Fibonacci, memoization is not required.
- Tail recursion optimization is possible in some JVMs, but this example is efficient as is.

