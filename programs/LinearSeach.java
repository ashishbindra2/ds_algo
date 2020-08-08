package programs;
// time complexity of linear serach is o(n)
public class LinearSeach {

	public static void main(String[] args) {
	int arr[] = {11,33,44,66,22,11,447,6}; 
	int f =6;
   System.out.println("on index "+linear(arr,f));
	}
	public static int linear(int[] a,int find) {
		for(int i=0;i<a.length;i++)
		if(find==a[i]) {
			return i;
		}
	
	return-1;
	}
}
