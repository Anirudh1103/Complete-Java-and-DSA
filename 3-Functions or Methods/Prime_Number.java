import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPrime(n));

    }
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        int c = 2;
        while (c* c <=n)
        {
            if(n%c == 0)
            {
                return false;
            }
            c++;
        }
        return (c*c>n);
    }

}
