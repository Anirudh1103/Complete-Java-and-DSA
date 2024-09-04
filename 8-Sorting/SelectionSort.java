import java.util.Arrays;
//Seperate functions for selection sort and finding max
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr)
    {
        int max,index = arr.length-1;
        for(int i=0;i<arr.length;i++) {
            max = maxElement(arr, arr.length-i);
            int temp = arr[index];
            arr[index--] = arr[max];
            arr[max] = temp;
            }
    }
    static int maxElement(int[] arr, int n)
    {
        int max = arr[0],index = 0;
        for(int i=0;i<n;i++)
            if(arr[i]>max) {
                max = arr[i];
                index = i;
            }
        return index;
    }
}
