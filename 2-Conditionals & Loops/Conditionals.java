import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
        //The below is demonstration of if statement via a sample program
        //Program: Greatest of 3 numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        System.out.print("Enter the value of c: ");
        int c = input.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is greater");
        }
        else if(b>a && b>c){
            System.out.println(b + " is greater");
        }
        else {
            System.out.println(c + " is greater");
        }

    }
}
