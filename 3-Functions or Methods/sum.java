import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        //function call
        sum();
    }
    //function declaration
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum is " + sum);
    }
}
