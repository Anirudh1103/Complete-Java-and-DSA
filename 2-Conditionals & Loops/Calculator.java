import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //This program will take input from the user until the user does not press X or x
        /*The below while loop is an infinate loop it will run infinate number of times as the
        condition is always true to make the loop exit we need to add a condition where the loop
        condition will be equal to false.
         */
        while (true){
            System.out.println("Enter the operator(+,-,*,/,%): ");
            System.out.println("Press X or x to exit.");
            char ch = in.next().trim().charAt(0);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.println("Enter the value of a: ");
                int a = in.nextInt();
                System.out.println("Enter the value of b: ");
                int b = in.nextInt();
                if(ch == '+')
                    System.out.println(a+b);
                if(ch == '-')
                    System.out.println(a-b);
                if(ch == '*')
                    System.out.println(a*b);
                if(ch == '/')
                    System.out.println(a/b);
                if(ch == '%')
                    System.out.println(a%b);

            } else if (ch == 'X' || ch == 'x') {
                System.out.println("Thank you for using the Calculator.");
                break;
            }
            else {
                System.out.println("Invalid character");
            }

        }
    }
}
