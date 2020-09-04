package recursion;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
       System.out.println(path(0,10));
	}
	public static ArrayList<String> path(int start,int end) {
		if(start==end){
		ArrayList<String> br = new ArrayList<>();
		br.add("\n");
		return br;
		}
		if(start>end) {
			ArrayList<String> br = new ArrayList<String>();return br;
		}
		ArrayList<String> mr = new ArrayList<String>();
	    for(int dice=1;dice<=6;dice++) {
	    	ArrayList<String> al  = path(start+dice,end);
	    	for(String rr: al) {
	    		mr.add(rr+dice);	    	}
	    }
	    return mr;
	}
}
