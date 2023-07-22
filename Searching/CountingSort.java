import java.util.Arrays;

// Can sometimes give time complexity nearly equal to O(n)
// numbers must be +ve
// the numbers must be short
public class CountingSort {
    public static int[] countingSort(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest)
                largest = num[i];
        }
        int count[] = new int[largest + 1]; // +1 since it also includes 0
        for (int i = 0; i < num.length; i++) {
            count[num[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int num[] = { 10, 2, 2, 3, 5, 7, 6, 5, 10, 4 };
        System.out.println(Arrays.toString(countingSort(num)));
    }
}
