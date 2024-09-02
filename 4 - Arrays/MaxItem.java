public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {25,1,20,11,16,19};
        System.out.println(minItem(arr));
        System.out.println(maxItem(arr));
    }
    static int minItem(int[] arr)
    {
        int min = arr[0];
        for(int i=1;i< arr.length;i++)
            if(arr[i]<min)
                min = arr[i];
        return min;
    }
    static int maxItem(int[] arr)
    {
        int max = arr[0];
        for(int i=1;i< arr.length;i++)
            if(arr[i]>max)
                max = arr[i];
        return max;
    }
}
