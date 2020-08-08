package programs;

public class BinarySeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] aee = {1,4,6,9,11,13,15,17,18,19,21,22,27,43,65,76,87,99};
       int a=992;
       System.out.println(binarySeach(aee,a));
	}
	public static int binarySeach(int a[] ,int l) {
		int low = 0;
		int high = a.length-1;
		while(low<=high) {
		int mid = (low + high)/2;
		if(a[mid]==l) {
			return mid;  
		}
		else if(a[mid]<l){
			low= mid+1;
		}
		else {
			high = mid-1;
		}
		}
		return -1;
	}

}
