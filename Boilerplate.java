import java.util.*;

public class Boilerplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // byte -> short -> int -> float -> long -> double
            System.out.print("Enter Num : ");
            int a = sc.nextInt();
            float converted = a;
            System.out.println("Converted num is " + converted);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}