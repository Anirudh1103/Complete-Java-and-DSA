import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
    static int[] reverseArray(int[] arr)
    {
        int ans=0;
        int[] rev_arr = new int[arr.length];
        for(int i= arr.length-1;i>=0;i--)
            rev_arr[ans++] = arr[i];
        return rev_arr;

    }
}
