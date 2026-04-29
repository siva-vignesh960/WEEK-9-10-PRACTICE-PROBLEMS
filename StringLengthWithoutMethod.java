import java.util.Scanner;

public class StringLengthWithoutMethod {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); // keep accessing characters
                count++;
            }
        } catch (Exception e) {
            // Exception occurs when index is out of bounds
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int userLength = findLength(str);
        int actualLength = str.length();

        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in method: " + actualLength);

        sc.close();
    }
}