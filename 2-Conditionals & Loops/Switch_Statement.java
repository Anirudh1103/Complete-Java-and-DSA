public class Switch_Statement {
    public static void main(String[] args) {
        //Old syntax
        String fruit = "Watermelon";
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
    }

}
