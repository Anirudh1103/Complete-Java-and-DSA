
public class Loops {
    public static void main(String[] args) {
        //For loop
        /* Syntax:
        for(initialization;Condition;increment/decrement)
        {

        }
         */
        for(int i= 1; i<=5;i++){
            System.out.println(i);
        }
        //For loop is used when we don't know how many times we need to run the loop
        //While loop
        /* Syntax:
        while(condition)
        {
        }
        */
        //Q: Print numbers from 5 to 1
        System.out.println("While loop:");
        int i=5;
        while(i>=1)
        {
            System.out.println(i);
            i-=1;
        }
        //Do While loop
        /*Syntax:
        do{

        }while(condition);
         */
        //Do while loop runs the loop first and then checks the condition.
        System.out.println("Do while loop: ");
        do {
            System.out.println(i);
            i+=1;
        }while(i<=5);


    }
}
