public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9,10};
        int key = 7;
        System.out.println(ceilingNumber(arr,key));
    }
    static int ceilingNumber(int[] arr,int key)
    {
        int start=0,end=arr.length-1;
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
        return start;
    }
}
