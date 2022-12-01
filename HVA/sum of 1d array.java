class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        int[] a=new int[l];
        int i,j,k=0;
        for(i=0;i<l;i++)
        {
            int s=0;
            for(j=0;j<=i;j++)
            {
                
                s=s+nums[j];
            }
            a[k]=s;
            k++;
        }
        return a;
        }
}