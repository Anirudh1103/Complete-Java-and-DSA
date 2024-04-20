import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        /* Output */
        System.out.println("Hey how are you?");
        //input
        Scanner input = new Scanner(System.in);
        //Taking input of INTEGER
        System.out.println("Enter your roll no:");
        int rollNo = input.nextInt();
        //Taking input of first string
        System.out.println("Enter your name: ");
        String name = input.next();
        //Taking input of entire sentence
        System.out.println("Enter a Sentence: ");
        String sentence = input.nextLine();
        //Taking input of decimal number
        System.out.println("Enter a decimal number: ");
        float decimalNumber = input.nextFloat();
        //Taking input of Boolean value
        System.out.println("Enter a Boolean value True/False");
        boolean check = input.nextBoolean();


        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(sentence);
        System.out.println(decimalNumber);
        System.out.println(check);
    }
}
