import java.util.Scanner;

public class Array_Input_Output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter the value of Array[" + i + "] : ");
            arr[i] = input.nextInt();
        }
        //Printing all the elements in an array
        System.out.println("Printing all array elements: ");
        System.out.print("arr[");
        //Enhanced for loop
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.print("]");
    }
}
