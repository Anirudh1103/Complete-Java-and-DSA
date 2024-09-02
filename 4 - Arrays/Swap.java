import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //swapping 1 and 5 ie index_1 = 0 & index_5=4
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int index_1,int index_2)
    {
        int temp = arr[index_1];
        arr[index_1] = arr[index_2];
        arr[index_2] = temp;
    }
}
