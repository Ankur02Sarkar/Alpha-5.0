package Sorting;

import java.util.Arrays;

public class SelectionSort {
    // find the minimum number and push it to the beginning
    public static int[] selectionSort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            // since last position will be sorted by itself we are checking till n-1
            int minPos = i;
            for (int j = i + 1; j < num.length; j++)
                if (num[j] < num[minPos])
                    minPos = j;

            int tmp = num[minPos];
            num[minPos] = num[i];
            num[i] = tmp;
        }
        return num;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 7, 6, 5, 4 };
        System.out.println(Arrays.toString(selectionSort(num)));
    }
}
/*

public class SelectionSort {
    void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first element of the unsorted array
            // only if the minimum element is not already in its correct position
            if (min_idx != i) {
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Test the code
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array: ");
        ob.printArray(arr);
    }
}

*/
