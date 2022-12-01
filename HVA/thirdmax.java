class Solution {
    public int thirdMax(int[] a) {
        int i,j,t=0,c=0,r=0,l=a.length;
        for(i=0;i<l;i++)
        {
            for(j=1;j<l-i;j++)
            {
                if(a[j-1]<a[j])
                {
                    t=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                }
            }
        }
        for(i=1;i<l;i++)
        {
            if(a[i-1]!=a[i])
            {
                c=i;
                r++;
                if(r==2)
                    break;
            }
        }
        if(r==2)
        return a[c];
        else
            return a[0];
    }
}