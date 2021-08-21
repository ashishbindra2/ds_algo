"# ds_algo" 
 public static long modePow(long base, long n,long mode){
         long ans=1;
         while(n>0){
             if(n%2==0){
                 base = (base*base)%mode;
                 n=n/2;
             }else{
                 ans = (ans*base)%mode;
                 n=n-1;
             }
         }
         return ans;
     }
