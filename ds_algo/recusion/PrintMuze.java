package recursion;

import java.util.ArrayList;

public class PrintMuze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
muze(0,0,2,2,"");
System.out.print(getmuze(0,0,2,2));
	}
 static ArrayList<String> getmuze(int r, int c, int er, int ec) {
		// TODO Auto-generated method stub
		if(r==er&&c==ec) {
			ArrayList <String> mr = new ArrayList<>();
			mr.add("");
			return mr;
		}
		if(r>er||c>er) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> av =getmuze( r+1, c,  er,  ec);
		for(String avd:av)
		a.add("V"+avd	);
		ArrayList<String> ah =getmuze( r,  c+1, er, ec);
		for(String avd:ah)
		a.add("H"+avd);
		return a;
	}
public static void muze(int r,int c,int er,int ec,String ans) {
	if(r==er&&c==ec)
		System.out.println(ans);
	if(r>er||c>er)
		return;
	//for(int i=0;i<er;i++) {
		muze(r+1,c,er,ec,ans+"V");
		muze(r,c+1,er,ec,ans+"H");
	//}
}
}
