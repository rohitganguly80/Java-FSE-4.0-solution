package dsa.ques7;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return calculateFutureValue(principal, rate, years - 1) * (1 + rate);
    }

    // Optimized version using memoization to reduce repeated calculations
    public static double calculateFutureValueMemo(double principal, double rate, int years, double[] memo) {
        if (years == 0) return principal;
        if (memo[years] != 0) return memo[years];
        return memo[years] = calculateFutureValueMemo(principal, rate, years - 1, memo) * (1 + rate);
    }

    public static void main(String[] args) {
        double principal = 1000;
        double growthRate = 0.10; // 10%
        int years = 5;

        // Basic recursive
        double futureValue = calculateFutureValue(principal, growthRate, years);
        System.out.println("Future Value (Recursive): " + futureValue);

        // Optimized with memoization
        double[] memo = new double[years + 1];
        double futureValueMemo = calculateFutureValueMemo(principal, growthRate, years, memo);
        System.out.println("Future Value (Memoized): " + futureValueMemo);
    }
}
