import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Taking user input for an array
        Scanner ip = new Scanner(System.in);
        int[] RollNo = new int[5];

        for(int i=0;i<RollNo.length;i++)
        {
            System.out.print("Enter the value of RollNo["+i+"] :");
            RollNo[i] = ip.nextInt();
            System.out.println();
        }
        for(int i=0;i< RollNo.length;i++)
            System.out.print(RollNo[i] + " ");
    }
}
