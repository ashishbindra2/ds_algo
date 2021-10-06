import java.io.*;
import java.util.*;

public class Main {
    static int siz = 100001;
	static boolean se[] = new boolean[siz + 1];

    public static void main(String args[] ) throws Exception {

     BufferedOutputStream out = new BufferedOutputStream(System.out);  
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
		for (  int i= 2; (i * i) <=siz; i++) {
			if (se[i-1] == false) {
				for (int p = (i * i); p <=siz; p += i) {
						se[p-1] = true;
				}
			}
		}	
          int n = Integer.parseInt(st.nextToken());
			for(int i=1;i<=n;i++) 
            {
                    if(n<3)  out.write(("1\n").getBytes());
        else  out.write(("2\n").getBytes());

        for(i=2; i<=n+1; i++)
        {
            if(se[i-1]==true) 
               out.write(("2 ").getBytes());
            else  out.write(("1 ").getBytes());
        }
 out.write(("\n").getBytes());
             }
           out.flush();

    }
}
