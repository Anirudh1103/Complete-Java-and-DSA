import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,38,48,50}
        };
        int target = 35;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int [][] matrix, int target)
    {
        int row = 0, col = matrix.length-1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return new int[]{row, col};
            if(matrix[row][col] < target)
                row++;
            else col--;
        }
        return new int[] {-1,-1};
    }
    public static int[] LinearSearch(int[][] arr,int target)
    {
        for(int row=0;row< arr.length;row++)
            for(int col=0;col<arr[row].length;col++)
                if(arr[row][col] == target)
                    return new int[] {row,col};
        return new int[] {-1,-1};
    }
}
