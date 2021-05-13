import java.util.HashMap;

public class Frequency {

	public static void main(String args[]) {
		String s = "ashish";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();// Creating HashMap
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
}
