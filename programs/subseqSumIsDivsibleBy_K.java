//count the no of subsequence whose sum is divisbal by k
import java.util.*;

class Main {
   static int countSeq(int ind,int sum,int a[],int n,int k){
     if(ind == n )
     { 
         if(sum%k==0) return 1;
         return 0;
 }
 return countSeq(ind+1,sum+a[ind],a,n,k)+countSeq(ind+1,sum,a,n,k);
    }

    public static void main(String args[] ) throws Exception {
      
      int a[]={2,3,5};
    System.out.println(countSeq(0,0,a,a.length-1,5));

}
}
