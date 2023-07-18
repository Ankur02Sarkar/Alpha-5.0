package Arrays;
/* 
public class MaxSubarraySum {
    // BRUTE FORCE METHOD
    static int currSum = 0;
    static int maxSum = Integer.MIN_VALUE;

    public static void subarrSum(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.println("curr sum : " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("mx sum : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7 };
        subarrSum((numbers));
    }

}
*/

/* 
public class MaxSubarraySum {
    // PREFIX SUM METHOD
    public static void subarrSum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int[] prefixSum = new int[numbers.length];

        prefixSum[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currSum = prefixSum[j] - (i > 0 ? prefixSum[i - 1] : 0);
                System.out.println("curr sum : " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7 };
        subarrSum((numbers));
    }
}
*/

public class MaxSubarraySum {
    // KADANE's ALGO METHOD

    public static void subarrSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            System.out.println("curr sum : " + currSum);
            maxSum = Math.max(currSum, maxSum);
            System.out.println("curr mx sum : " + maxSum);
        }
        System.out.println("mx sum : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -1, 2, -3, 4, 5, -6, 7, -10 };
        subarrSum((numbers));
    }

}
