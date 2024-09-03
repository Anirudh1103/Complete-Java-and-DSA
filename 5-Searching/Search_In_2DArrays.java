import java.util.Arrays;

public class Search_In_2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {3,6,9},
                {12,15,18},
                {21,24,27}
        };
        int key = 27;
        System.out.println(Arrays.toString(search(arr,key)));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr,int key)
    {
        for(int row=0;row<arr.length;row++)
            for(int col=0;col<arr[row].length;col++)
                if(arr[row][col] == key)
                    return new int[] {row,col};
        return new int[] {-1};
    }
    static int max(int[][] arr)
    {
        int max = arr[0][0];
        for(int row=0;row<arr.length;row++)
            for(int col=0;col<arr[row].length;col++)
                if(arr[row][col] > max)
                    max = arr[row][col];
        return max;

    }
}
