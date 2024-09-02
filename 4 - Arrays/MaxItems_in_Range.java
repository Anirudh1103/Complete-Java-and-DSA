public class MaxItems_in_Range {
    public static void main(String[] args) {
        int[] arr = {100,24,21,13,16,5999};
        System.out.println(maxItem_in_Range(arr,1,5));
    }
    static int maxItem_in_Range(int[] arr,int start,int end)
    {
        int max = arr[start];
        for( start=1;start<end;start++)
            if(arr[start]>max)
                max = arr[start];
        return max;
    }
}
