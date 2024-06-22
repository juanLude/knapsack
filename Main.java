public class Main {
    public static void main(String[] args) {
        // Example weights and values
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;
        int n = weights.length;

        // Call the knapsack method from the Knapsack class
        int maxValue = Knapsack.knapsack(weights, values, n, capacity);
        System.out.println("The maximum value that can be obtained is: " + maxValue);
    }
}