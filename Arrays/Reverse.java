package Arrays;

import java.util.*;

public class Reverse {
    public static int[] reverse(int numbers[]) {
        int st = 0, end = numbers.length - 1;
        while (st < end) {
            int tmp = numbers[end];
            numbers[end] = numbers[st];
            numbers[st] = tmp;

            st++;
            end--;
        }
        System.out.println(Arrays.toString(numbers));

        return numbers;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(reverse(numbers)));
    }

}
