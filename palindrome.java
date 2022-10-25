//4. To check whether the given input string is Palindrome or not (without string functions).
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        String str,rev="";
        System.out.println("Enter the word:");
        Scanner scn = new Scanner(System.in);
        str = scn.next();

        int len = str.length();
        for ( int i = len - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);
        if (str.equals(rev))
            System.out.println("Entered word is a palindrome.");
        else
            System.out.println("Entered word is not a palindrome.");
    }
}

