public class Shadowing {
    static String sentence = "This is a string variable within the Shadowing block!";
    //We can access the above variable sentence anywhere within the shadowing block.
    //Static variables are independent variables they can be accessed anywhere within the block
    public static void main(String[] args) {
        String sentence = "This is a string variable within the main block";
        //The above variable can only be accessed within the main block
        //The below print statement will print the variable value within the main block
        System.out.println(sentence);
        shadow();
    }

    static void shadow(){
        //This will print the value of the variable within the shadowing block
        //The variable in the main block cannot be accessed here
        System.out.println(sentence);
    }
}
//The two same variables sentence have different scopes in the above program
//We can create two variables in same name
//we can also create two functions in same name but with different parameters its called function overloading.

