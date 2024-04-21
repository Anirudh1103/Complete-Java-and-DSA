/*
Method Overloading: Defining a function with same name but with different parameters is
known as Method or Function overlaoding.
 */
public class Overloading {
    static void sum(int a){
        System.out.println("To perform addition two numbers are needed");
        System.out.println("Here there is only one number: " + a);
    }
    static void sum(int a, int b){
        System.out.println("The sum of " + a + " & " + b + " is: " + (a+b));

    }
    static void sum(int a, int b, int c){
        System.out.println("The sum of " + a + " & " + b + " & " + c + " is: " + (a+b+c));

    }

    public static void main(String[] args) {
        sum(10);
        sum(10,20);
        sum(10,20,10);

    }
}
//In the above code the sum() function is defined 3 times but each of them have different parameters

