import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int count=0;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j <= i; ++j) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
