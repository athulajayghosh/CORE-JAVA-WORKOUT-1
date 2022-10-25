import java.util.Scanner;

//6. Find whether the given character is vowel or consonant using switch control
public class vowelOrConsonant {
    public static void main(String args[]) {
        String str,chk;
        System.out.println("Enter the word:");
        Scanner scn = new Scanner(System.in);
        str = scn.next();
        chk = str.toLowerCase();
        if (chk.charAt(0)=='a' ||
                str.charAt(0)=='e' ||
                str.charAt(0)=='i' ||
                str.charAt(0)=='o' ||
                str.charAt(0)=='u'){
            System.out.println("The word "+str+" is vowel");
        }
        else {
            System.out.println("The word "+str+" is consonant");
        }

    }
}


