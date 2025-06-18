import java.util.Scanner;

public class FinancialForecasting {

    // Calculating future value
    public static double predictFutureValue(double currVal, double growthRate, int years) {
        if (years == 0)
            return currVal;
        return predictFutureValue(currVal*(1+growthRate), growthRate, years-1); // recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current value: ");
        double currVal = sc.nextDouble();

        System.out.print("Enter annual growth rate (in decimal) : ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter number of years to predict : ");
        int years = sc.nextInt();

        double futureValue = predictFutureValue(currVal, growthRate, years);
        System.out.println("Predicted future value : Rs. " + String.format("%.2f", futureValue));

        sc.close();
    }
}

// Optimization -> using iteration to avoid recursion overhead