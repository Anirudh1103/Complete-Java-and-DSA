public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr_2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0;i< arr_2D.length;i++) {
            for (int j = 0; j < arr_2D.length; j++)
                System.out.print(arr_2D[i][j] + " ");
            System.out.println();
        }
    }
}
