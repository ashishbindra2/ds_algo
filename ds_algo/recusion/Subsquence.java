package recursion;

import java.util.ArrayList;

public class Subsquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       System.out.println( getss("ab"));

	}
	static ArrayList<String> getss(String str){
		if(str.length()==0) {
		    ArrayList <String> br = new ArrayList<>();
            br.add("");
			return br;
		}
		char c = str.charAt(0);
		String s =	str.substring(1);
	  ArrayList <String> ai = new ArrayList<>();
	  ArrayList <String> resu =getss(s);
	  int acc = (int)c;
	for(int i=0;i<resu.size();i++) {
		ai.add(resu.get(i));
//		ai.add(c+resu.get(i));
		ai.add(acc+resu.get(i));
	}
	return ai ;
}
}
