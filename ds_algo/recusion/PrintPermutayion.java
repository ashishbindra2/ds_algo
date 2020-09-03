package recursion;

public class PrintPermutayion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  printP("abc","");
	}
public static void printP(String ar,String result) {
	 
	if(ar.length()==0) {
		System.out.println(result);
		return;
	}
	  for(int i=0;i<ar.length();i++) {
		  char c = ar.charAt(i);
		  String s = ar.substring(0,i)+ar.substring(i+1);
		  printP(s,result+c);	
	  }
}
}
