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
        int num[] = { 1,2,3,4,5,6,7 };
        System.out.println(Arrays.toString(bubblesort(num)));
    }
}
