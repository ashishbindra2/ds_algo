https://leetcode.com/problems/ugly-number/
class Solution {
    public boolean isUgly(int n) {
          if(n==0)
        return false;
        int a[]={2,3,5};
         int i=0; 
        while(n!=0&&i<3){
           if(n%a[i]==0)
                n/=a[i];
            else
                i++;
        }
        if(n==0||n==1)
        return true;
     return false; 
    }
}
