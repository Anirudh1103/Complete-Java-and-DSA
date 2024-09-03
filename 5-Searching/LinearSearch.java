public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        int key = 14;
        System.out.println(linear_search(arr,key));

    }
    static int linear_search(int[] arr,int key)
    {
        if(arr.length == 0)
            return -1;
        for(int i=0;i< arr.length;i++)
            if(key == arr[i])
                return i;
        return -1;
    }
}
