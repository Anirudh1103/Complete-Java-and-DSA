public class Leetcode_1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static  int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0,temp = nums[i];
            while(temp!=0)
            {
                temp= temp/10;
                count++;
            }
            if(count%2==0)
                ans++;
        }
        return ans;
    }
}
