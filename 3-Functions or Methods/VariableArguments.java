import java.util.Arrays;

public class VariableArguments {
    //Variable Arguments is used when we dont know how many number of inputs we have to give to our code
    public static void main(String[] args) {
        function(1,2,3,4,5,6,7,8,9);

    }
    static void function(int ...a){
        //...var_name will take n number of arguments
        //It will take input in form of arrays
        System.out.println(Arrays.toString(a));
    }
}
