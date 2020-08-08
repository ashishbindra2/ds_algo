package programs;

public class ArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int s= Integer.MIN_VALUE;
//        System.out.println(s);
        int a[]= {4,22,66,11,78,12};
        for(int i=0; i<a.length;i++) {
        	if(s<a[i]) {
        		s=a[i];
        	}
        }
        System.out.println(s);
	}

}
