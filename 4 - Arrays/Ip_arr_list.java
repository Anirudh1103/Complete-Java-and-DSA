import java.util.ArrayList;
import java.util.Scanner;

public class Ip_arr_list {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        Scanner ip = new Scanner(System.in);
        for(int i=0;i<9;i++)
        {
            System.out.println("Enter the value of list["+i+"]: ");
            arr.add(ip.nextInt());
        }

        System.out.println(arr);
    }
}
