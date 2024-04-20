import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("What is your name? : ");
        Scanner input = new Scanner(System.in);
        greetings(input.next());
    }
    //Here we are taking name as input and we are passing that as parameter for greeting function
    static void greetings(String str)
    {
        System.out.println("Hello " + str);

    }
}
