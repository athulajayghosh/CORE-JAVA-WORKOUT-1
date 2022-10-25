//5. To display all the perfect square numbers between two input numbers interval.
import java.util.Scanner;

public class perfectSquare {
    public static void main(String args[]) {
        int start, end;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the start:");
        start = scn.nextInt();
        System.out.println("Enter the end:");
        end = scn.nextInt();

        if(start<end){
            int i,squre;
            for (i=1;i<end;i++){
                squre= i*i;
                if (squre>=start && squre<=end)
                    System.out.print(squre+" ");
            }
        }
        else {
            System.out.println("Invalid Range");
        }
    }
}
