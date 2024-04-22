import java.util.Scanner;

public class Passing_Array_in_Functions {
    public static void main(String[] args) {
        //Lets write a program to find sum of elements in an array
        Scanner input = new Scanner(System.in);
        //Declaration of Array
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter the value of arr [" + i + "] : ");
            arr[i] = input.nextInt();
        }
        //Calling the function and printing the sum
        System.out.println("Sum =  " + Sum_of_Array(arr));
    }
    //We are passing array as parameter for the function Sum_of_Array
    static int Sum_of_Array(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}
