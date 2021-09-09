import java.util.*;

public class Frequency {
	  public static void frq(String s) {
    	HashMap<Character, Integer> map = new HashMap<>();// Creating HashMap
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
		      map.put(c,map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);

    }
    public static void mapp(String s) {
    	HashMap<Character, Integer> map = new HashMap<>();// Creating HashMap
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

    }
    public static void frq(String s) {
    	int frq[] = new int[256];
    	for(char it:s.toCharArray()) {
    		frq[it]++;
    	}
    	for(int i=0;i<256;i++) {
    	
    		if(frq[i]>0) {
    			char c=((char)(frq[i]));
    			System.out.println((char)i+"->"+frq[i]+"");
    		}
    		
    	}
    }
	public static void main(String args[]) {
		String s = "Aashish";
		mapp(s);
		frq(s);
		
	}
}
