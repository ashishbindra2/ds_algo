class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean b =false;
       for(int i=0;i<31;i++){
           if((n^(1<<i))==0){
               b=true;
              break;
           }
           if((1<<i)>n) 
               break;
       }
        return b;
    }
} 

//fastest
class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n < 1) return false;
        return (0 == ((n - 1) & n));
    }
}  
