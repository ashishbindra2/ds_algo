package programs;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {9,6,7,4,2,7};
selection(a);
	}
  public static void selection(int[] arr) {
	  for(int i=0;i<arr.length-1;i++) {
		  int min=i;
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[min]>arr[j]) {
				  min=j;
			  }
		  }
		  int temp = arr[min];
		  arr[min]=arr[i];
		  arr[i]= temp;
	  }
	  for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i]);
	  }
  }
}
