//1. To convert the input temperature value in Fahrenheit to Celsius.
import java.util.Scanner;

public class FtoC {
    public static void main(String args[])
    {
        float fahrenhiet,celsius;

        System.out.println("Enter temperature in Fahrenheit:");
        Scanner scn = new Scanner(System.in);
        fahrenhiet = scn.nextFloat();

        celsius = ((fahrenhiet-32)*5/9);
        System.out.println("Temperature in Celsius: "+celsius+"°C");

    }
}