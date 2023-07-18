import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        int arr[] = new int[5];
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("You Entered : ");
        for (int i = 0; i < n; ++i) {
            System.out.println("a[" + i + "]= " + arr[i]);
        }
        scanner.close();
    }
}
