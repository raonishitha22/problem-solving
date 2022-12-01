class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length,i,j,t=0,r=0,flag=0;
        for(i=1;i<l;i++)
        {
            if(nums[i-1]==target)
            {
                t=i-1;
                flag++;
                break;
            }
           
            
            
        }
        if(flag!=0)
            return t;
        else
        {
            if(nums[l-1]<target)
                r=l;
            else if(nums[0]>target)
                r=0;
            else
            {
          for(i=1;i<l;i++)
          {
              if(nums[i-1]<target)
                  r=i;
          }
            }
            
        }
        return r;
        
    }
}