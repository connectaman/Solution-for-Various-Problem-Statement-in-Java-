package DiffBWMaxMinArray;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int testIndex = 0; testIndex < testCase; testIndex++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int size = n - m;
            int intArray[] = new int[n];
            for (int index = 0; index < n; index++) {
                intArray[index] = sc.nextInt();
            }
            Arrays.sort(intArray);
            int maxSum = calculateMaxSum(intArray, n, size);
            int minSum = calculateMinSum(intArray, size);
            System.out.println((maxSum - minSum));
        }
    }
    public static int calculateMinSum(int[] intArray, int size) {
        int minimum = 0;
        for (int i = 0; i < size; i++) {
            minimum += intArray[i];
        }
        return minimum;
    }
    public static int calculateMaxSum(int[] intArray, int n, int size) {
        int maximum = 0;
        for (int i = n - 1; i >= (n - size); i--) {
            maximum += intArray[i];
        }
        return maximum;
    }
}