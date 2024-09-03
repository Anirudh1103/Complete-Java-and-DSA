public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8,8, 9, 12, 15, 18, 21, 24, 27, 30};
        int key = 8;
        System.out.println(binary_search(arr,key));
    }
    static int binary_search(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key < arr[mid])
                end = mid - 1;
            else if (key > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
