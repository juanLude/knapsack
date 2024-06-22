// parametres
/*
-  the total amount of weight you can carry (weightCap)
-  the weights of all of the items in an array (weights)
-  the values of all of the items in an array (values)

 TODO: Function that returns the maximum value able to carry.

 Example:
    weightCap = 5kg
    weights = [1kg, 3kg, 5kg]
    values = [$250, $300, $500]
    int n = values.length
 */

// Brute force solution (Recursive)
public class Knapsack {
public static int knapsack(int[] weights, int[] values, int n, int capacity) {
    // Base case: If there are no items or capacity is 0
    if (n == 0 || capacity == 0) {
        return 0;
    }

    // If the weight of the nth item is more than the knapsack capacity, it cannot be included
    if (weights[n - 1] > capacity) {
        return knapsack(weights, values, n - 1, capacity);
    } else {
        // Return the maximum of two cases:
        // 1. nth item included
        // 2. not included
        int include = values[n - 1] + knapsack(weights, values, n - 1, capacity - weights[n - 1]);
        int exclude = knapsack(weights, values, n - 1, capacity);
        return Math.max(include, exclude);
    }
}
}
