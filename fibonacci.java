//3. To generate Fibonacci series up to the given input number using recursion
import java.util.Scanner;

public class fibonacci {
    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1 || num == 2){
            return 1;
        }
        return fibonacci(num-2) + fibonacci(num-1);
    }
    public static void main(String args[]) {
        int max;
        System.out.println("Enter upto which number:");
        Scanner scn = new Scanner(System.in);
        max= scn.nextInt();
        System.out.print("Fibonacci Series of "+max+" numbers: ");
        for(int i = 0; i < max; i++){
            System.out.print(fibonacci(i) +" ");
        }
    }
}

