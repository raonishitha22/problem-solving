class Solution {
    public int removeDuplicates(int[] a) {
        int l=a.length,i,j=1;
            for(i=1;i<l;i++)
        {
           if(a[i-1]!=a[i])
           {
               a[j]=a[i];
               j++;
           }
        }
        return j;
    }
}