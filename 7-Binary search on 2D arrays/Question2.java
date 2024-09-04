import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 2;
        int mid = arr.length/2;
        if(arr[mid][mid] > target)
            System.out.println(Arrays.toString(BinarySearch(arr,target,0,mid)));
        else if (arr[mid][mid] < target) {
            System.out.println(Arrays.toString(BinarySearch(arr,target,mid, arr.length-1)));
        }
    }
        
        
    public static int[] BinarySearch(int[][] matrix,int target, int start, int col)
    {
        int end = matrix.length-1;
        for(int i=0;i<col;i++)

    }

}
