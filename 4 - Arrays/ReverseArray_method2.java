import java.util.Arrays;

public class ReverseArray_method2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse_array(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse_array(int[] arr)
    {
        int left=0,right = arr.length-1;
        while(left<right)
        {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
