//2. Program to generate a Triangle.
import java.util.Scanner;

public class triangle {
    public static void main(String args[]) {
        int range, i;
        int x = 1;
        System.out.println("Enter upto which number:");
        Scanner scn = new Scanner(System.in);
        range = scn.nextInt();

        while (x != range+1) {
            for (i = 0; i < x; i++) {
                System.out.print(x);
            }
            System.out.print("\n");
            x++;
        }
    }
}
