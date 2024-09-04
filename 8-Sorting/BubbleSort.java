import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
            for(int j=1;j< arr.length - i;j++)
            {
                int temp = 0;
                if(arr[j]<arr[j-1])
                {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
    }
}

