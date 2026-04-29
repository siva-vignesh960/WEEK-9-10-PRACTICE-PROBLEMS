import java.util.Scanner;

public class SplitWithoutMethod {

    // Method to count length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Method to split string manually using charAt()
    public static String[] splitUsingCharAt(String str) {

        int length = findLength(str);

        // Count words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || str.charAt(i) == ' ') {
                String word = "";

                for (int j = start; j < i; j++) {
                    word += str.charAt(j);
                }

                words[index++] = word;
                start = i + 1;
            }
        }

        return words;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] userSplit = splitUsingCharAt(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("\nWords using charAt():");
        for (String word : userSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        boolean result = compareArrays(userSplit, builtInSplit);

        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}