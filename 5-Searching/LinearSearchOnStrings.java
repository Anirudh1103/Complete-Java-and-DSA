public class LinearSearchOnStrings {
    public static void main(String[] args) {
        String[] arr = {"Anirudh","Amith","Ani"};
        String key = "Anirudh";
        System.out.println(LinearSearch(arr,key));

    }
    static boolean LinearSearch(String[] arr, String key)
    {
        if(arr.length == 0)
            return false;
        for(int i=0;i< arr.length;i++)
            if(key == arr[i])
                return true;
        return false;
    }
}
