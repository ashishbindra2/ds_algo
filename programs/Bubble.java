package programs;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = {80,70,60,90,50,40,30,2};
     bubble(arr);
	}
public static void bubble(int arr[]) {
for(int i=0;i<arr.length-1;i++) {
	for(int j=0;j<arr.length-1-i;j++) {
		if(arr[j]>arr[j+1]) {
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1]=temp;
		}
	}
}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
}
}
