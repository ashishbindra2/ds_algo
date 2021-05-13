import java.util.Scanner;

public class CSUMQ {

	private static Scanner sc;

	public static void main(String[] args) {
		int n, q, sum = 0;
		sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		q = sc.nextInt();
		while (q > 0) {
			int i, j;
			sum=0;
			i = sc.nextInt();
			j = sc.nextInt();
			for (int x = i; x <= j; x++) {
				sum += a[x];
			}
			System.out.println(sum);
		}
	}

}
