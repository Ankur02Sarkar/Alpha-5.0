package Sorting;

/* 

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubblesort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) { // turns
            // swaps pairs of two on every turn and the highest num is sent to last
            // thus from the next loop it does not check for the last num since the
            // highest num will always be at the last

            for (int j = 0; j < num.length - 1 - i; j++) {
                // swapping nums of current turn
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int num[] = { 7,6,5,4,3,2,1 };
        System.out.println(Arrays.toString(bubblesort(num)));
    }
}

*/

// Optimized Bubble Sort
import java.util.Arrays;

public class BubbleSort {
    public static int[] bubblesort(int num[]) {
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < num.length - 1; i++) {

            // Reset swapped flag for each pass
            swapped = false;

            // Inner loop for swapping pairs
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    // Swap elements
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                    // Set swapped flag to true
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is sorted.
            if (!swapped) {
                break;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int num[] = { 1,2,3,7,6,5,4 };
        System.out.println(Arrays.toString(bubblesort(num)));
    }
}
