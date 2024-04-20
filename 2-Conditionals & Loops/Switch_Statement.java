public class Switch_Statement {
    public static void main(String[] args) {
        //Old syntax
        String fruit = "Watermelon";
        System.out.println("Old syntax of swicth statemnet in Java: ");
        switch (fruit)
        {
            case "Apple":
                System.out.println("A red crunchy fruit.");
                break;
            case "Mango":
                System.out.println("A yellow juicy & tasty fruit");
                break;
            case "Watermelon":
                System.out.println("Hard from the outside soft and juicy from the inside!");
                break;
            default:
                System.out.println("Entered string is not a fruit");
        }
        //New syntax of switch  in java or Enhanced syntax
        System.out.println("Enhanced switch statement or New Syntax of Switch statement in java: ");
        switch (fruit)
        {
            case "Mango" -> System.out.println("A yellow juicy & tasty fruit");
            case "Apple" ->System.out.println("A red crunchy fruit.");
            case "Watermelon" -> System.out.println("Hard from the outside soft and juicy from the inside!");
            default -> System.out.println("Entered string is not a fruit");

        }
    }

}
