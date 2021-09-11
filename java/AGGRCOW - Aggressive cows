import java.util.Scanner;
import java.util.Arrays;

class Codechef {
	public static void main(String[] args)  {
	Scanner s = new Scanner(System.in);
	int t = s.nextInt();
	while(t-->0){
			int n = s.nextInt();
			int k = s.nextInt();
			long a[] = new long[n];
			for(int i=0;i<n;i++)
			    a[i]=s.nextLong();
			   Arrays.sort(a); 

			    long sum=0;
			    sum = getScore(a, n,k);
			    System.out.print(sum+"\n");
			}
	}
	
	// 1 2 4 8 9
	// 0 1 2 3 4
 public static long getScore(long a[],int n,int k){
      long low=1,high=a[n-1]-a[0];// 8
      
     	while (low <= high)
	       {
	           long lastCow=a[0],ct=1;
            	long mid = low + ((high - low) / 2);
            	for(int i=1;i<n;i++)
            	{
            	    if(a[i]-lastCow>=mid)
            	    {
            	        ct++;
            	        lastCow=a[i];
            	    }
            	if(ct>=k) break;
                }
            if(ct>=k)
            	low=mid+1;
            else 
            	high = mid-1;
            }
    return high;
}
}
