import java.util.Arrays;
import java.util.Collections;

public class InbuiltSorting {

    public static void main(String[] args) {
        Integer num[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        Arrays.sort(num, Collections.reverseOrder());
        System.out.println(Arrays.toString(num));
        Arrays.sort(num, 0, 3);
        System.out.println(Arrays.toString(num));

    }
}
