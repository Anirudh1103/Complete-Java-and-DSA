//Program to create a function which return avg of an array.
public class PassingArrayInFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(AvgOfArray(arr));
    }
    public static int AvgOfArray(int[] arr)
    {
        int sum = 0;
        for(int i: arr)
            sum+=i;
        return sum/ arr.length;
    }
}
