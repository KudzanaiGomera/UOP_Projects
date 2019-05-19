package firstsubroutines;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstsubroutines {

    public static void main(String[] args) {
        String str1;
        Scanner scan = new Scanner(System.in); // implementing user input
        System.out.println("Enter a String: ");
        str1 = scan.nextLine();

        // Omitting non letters example spaces, commas, number etc
        Pattern regex = Pattern.compile("[^A-Z0-9]");

        str1 = str1.toLowerCase(); // converting to lower cases
        if (str1.matches(".*" + regex + ".*")) {
            str1 = str1.replaceAll("[^\\p{L}\\p{Nd}]+", "");

            System.out.println("stripped:" + str1 + "\n");
        }

        // checking if the input is a palindrome
        if (str1.equals(copy(str1))) {
            System.out.println("This IS a palindrome.");
        } else {
            System.out.println("This is NOT a palindrome.");
        }

        

    }

    // the subroutine that reverses the input string.
    public static String reverse(String str) {
        String reverse;
        int i;
              
        reverse = "";
        for (i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
    // the subroutine that copy the stripped String 

    static String copy(String str2) {
        String copy;

        copy = reverse(str2);
        System.out.println("reversed: " + copy + "\n");

        return copy;
    }
}
