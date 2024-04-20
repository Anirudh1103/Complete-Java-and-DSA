public class Difference {
    public static void main(String[] args) {
        //We will learn about return statements in this code
        //return statement returns something to another function or main function
        //return specifies the end of the function as well
        int diff = subtract(10,2);
        System.out.println("The difference is " + diff);
    }
    static int subtract(int a, int b){
        //This function is taking 2 integer parameters
        return (a-b);
    }

}
