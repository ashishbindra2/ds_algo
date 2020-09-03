package recursion;

import java.util.ArrayList;

public class permutation {

	public static void main(String[] args) {
		System.out.println( getss("abc"));
	}
	static ArrayList<String> getss(String str){
		if(str.length()==0) {
			ArrayList <String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char c = str.charAt(0);
		String s =	str.substring(1);
		ArrayList <String> resu =getss(s);
		ArrayList <String> ai = new ArrayList<>();
	
		for(String rr:resu) {
		for(int i=0;i<=rr.length();i++) {
			ai.add(rr.substring(0,i)+c+rr.substring(i));
		}
		}
		return ai ;
	}
}
