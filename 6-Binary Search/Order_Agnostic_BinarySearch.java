public class Order_Agnostic_BinarySearch {
    public static void main(String[] args) {
        //int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int key = 12;
        int[] arr = {30,27,24,21,18,15,12,9,6,3};
        if(arr[0]<arr[arr.length-1])
            System.out.println(asc_BinarySearch(arr,key));
        else
            System.out.println(desc_BinarySearch(arr,key));
    }
    static int asc_BinarySearch(int[] arr,int key)
    {
        int start=0,end= arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(key<arr[mid])
                end = mid-1;
            else if(key>arr[mid])
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
    static int desc_BinarySearch(int[] arr,int key)
    {
        int start=0,end= arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(key>arr[mid])
                end = mid-1;
            else if(key<arr[mid])
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
}
