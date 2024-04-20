import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        /* Here in the below for loop I have taken i=3 because we are already printing
        first two numbers 0 & 1 therefore we need to print the value from 3rd number
        so I have initialized the value i as 3.
        */
        for(int i = 3;i <= n;i++)
        {
            int c = a + b;
            System.out.println(c);
            //Swapping the values
            //Here I'm not using a temp variable because we don't need the value of a
            a = b;
            b = c;
        }
    }
}
