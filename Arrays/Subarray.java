package Arrays;
// Subarray = continuous part of an array eg: 1,2,3,4 and not 1,2,4,5

public class Subarray {
    public static void printSubarray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4 };
        printSubarray((numbers));
    }
}
