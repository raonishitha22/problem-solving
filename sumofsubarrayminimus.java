class Solution {
    public int sumSubarrayMins(int[] arr) {
        int l=arr.length,i,j,k,t=0,min,r=0,p;
        int[] a=new int[l];
        for(i=0;i<l;i++)
        {
            for(p=i;p<l;p++)
            {
            k=0;
            for(j=i;j<=p;j++)
            {
                a[k]=arr[j];
                k++;
            }
            min=0;
            for(t=0;t<k;t++)
            {
                if(a[t]<a[min])
                    min=t;
            }
            r=r+a[min];
            }
        }
        return r;
    }
}