import java.util.Scanner;

public class Armstrong_Number {
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        boolean res = isArmstrong(n);
        System.out.println(res);
    }
}

