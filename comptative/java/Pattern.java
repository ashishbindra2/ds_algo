
public class Pattern {

	public static void p1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("* ");
			System.out.print("\n");
		}
	}

	public static void p2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--)
				System.out.print("  ");
			for (int j = 0; j < i; j++)
				System.out.print("* ");
			System.out.print("\n");
		}
	}

	public static void p3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 4 - i; j > 0; j--)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print("* ");

			System.out.print("\n");
		}
	}

	public static void p4() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(i + " ");

			System.out.print("\n");
		}
	}

	public static void p5() {
		int sum = 1;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(sum + " ");
				sum += 1;
			}

			System.out.print("\n");
		}
	}
	public static void p6() {
		char sum = 'A';
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(sum + " ");
				sum ++;
			}

			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		p1();
		System.out.print("---------------------------------------------");
		p2();
		System.out.print("---------------------------------------------");
		p3();
		System.out.println("---------------------------------------------");
		p4();
		System.out.println("---------------------------------------------");
		p5();
		System.out.println("---------------------------------------------");
		p6();
	}

}
