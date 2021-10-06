import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeFactors {
	public static int siz = 1000000;
	public static boolean seive[] = new boolean[siz+1];
	public static int frq[] = new int[siz+1];
	public static void seive() {
		for(int i =2;i*i<=siz;i++) {
			if(seive[i]==false) {
				frq[i]++;
				for(int p = i*i;p<=siz;p+=i) {
					if(seive[p]==false) {
						seive[p]=true;
					frq[i]++;
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		//StringBuilder s= new StringBuilder();
		seive();
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
 
        StringTokenizer st  = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
   
        while (t-- > 0) { 
        	   int n = Integer.parseInt(br.readLine());
        	if(n*n>siz &&seive[n]==false) {
        		System.out.print(1+"\n");
        	}else {
        		if(frq[n]==0)
        			System.out.print(1+"\n");
        		else
        		System.out.print(frq[n]+"\n");
        }
        }

	}

}
