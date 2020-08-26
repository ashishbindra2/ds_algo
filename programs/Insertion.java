package programs;

public class Insertion {
	
	public static void main(String arg[]){
		int arr[] = {88,66,99,44,66,33,22,11};
//		System.out.print(b);
		insertion(arr);
	}

	private static void insertion(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<=arr.length-1;i++) {
			int val=arr[i];
			int j=i-1;
		    while(j >=0 && arr[j]>val ) {
		    	arr[j+1] = arr[j];
		    	j--;
		    	
		    }
		    
		   arr[j+1]=val;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
