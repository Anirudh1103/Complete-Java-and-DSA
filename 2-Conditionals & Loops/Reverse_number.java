import java.util.Scanner;
public class Reverse_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int Original_Number = input.nextInt();
        /* Any number divided by 10 will give the last number as reminder
        for eg: 1563 % 10
        reminder = 3
        */
        int Reversed_number = 0;
        while(Original_Number>0){
            int rem = Original_Number %10;
            Original_Number /= 10;
            Reversed_number = Reversed_number * 10 + rem;
        }
        System.out.println(Reversed_number);
    }
}
