import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int num[]) {
        for (int i = 1; i < num.length; i++) {
            int key = num[i];
            int prev = i - 1;
            while (prev >= 0 && num[prev] > key) {
                num[prev + 1] = num[prev]; // shifting the nums to right
                prev--;
            }
            num[prev + 1] = key; // left is smaller than key so prev+1 is the correct position
        }
        return num;
    }

    public static void main(String[] args) {
        int num[] = { 10, 2, 3, 7, 6, 5, 4 };
        System.out.println(Arrays.toString(insertionSort(num)));
    }
}
