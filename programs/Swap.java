package programs;

public class Swap {

	public static void main(String[] args) {
		int i, j;
		i = 0;
		j = 2;
		int arr[] = { 10, 20, 50, 40, 40 };

		System.out.println(arr[i] + " " + arr[j]);

		swap1(arr[i], arr[j]);
		System.out.println(arr[i] + " " + arr[j]);
		swap2(arr, i,j);
		System.out.println(arr[i] + " " + arr[j]);

	}

	public static void swap1(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}
	
	public static void swap2(int[] arr,int i ,int j) {
		System.out.println(arr[i] + " " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println(arr[i] + " " + arr[j]);
	}
}
