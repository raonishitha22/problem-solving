class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length,i,j,k;
        int[] a=new int[2];
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                   a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
    }
}