class Solution {
    public int maxArea(int[] h) {
        int i,j,t,a=0,l=h.length;
       i=0;
        j=l-1;
               while(i<j)
               {
               if(h[j]>h[i])
                   t=h[i];
               else
                   t=h[j];
               
               if(t*(j-i)>a)
                       a=t*(j-i);
               if(h[j]<=h[i])
                   j--;
                   else
                       i++;
               }
               
        return a;
    }
}