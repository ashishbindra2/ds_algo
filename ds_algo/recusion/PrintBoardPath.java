package recursion;

public class PrintBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printBP(0, 10,"");
	}
	public static void printBP(int Start, int end,String ans) {
		if(Start==end)
			System.out.println(ans);
		if(Start>end)
			return;
		for(int dice=1;dice<=6;dice++) {
			printBP(Start+dice,end,ans+dice);
		}
	}

}
