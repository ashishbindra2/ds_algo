package recursion;

public class PrintSubSquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSS("abc","");
	}

	
	public static void printSS(String ar,String result) {
		if(ar.length()==0) {
			System.out.println(result+" ");
			return ;
		}
		char  ch = ar.charAt(0);
		String s = ar.substring(1);
	  	printSS(s,result);
	  	printSS(s,result+ch);
	}
}
