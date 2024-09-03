public class Max_Min_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,100};
        System.out.println(minElement(arr));
        System.out.println(maxElement(arr));

    }
    static int maxElement(int[] arr)
    {
        int max = arr[0];
        for(int i=1;i< arr.length;i++)
            if(arr[i]>max)
                max = arr[i];
        return max;
    }
    static int minElement(int[] arr)
    {
        int min = arr[0];
        for(int i=1;i< arr.length;i++)
            if(arr[i]<min)
                min = arr[i];
        return min;
    }
}
