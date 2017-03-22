package Mar_2;

public class CuriousNumbers {

	public static int fact(int x) {
		if (x > 1) {
			return fact(x - 1) * x;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = 0, sum;
		for (int i=3;; i++) {
			sum = 0;
			t = i;
			while (t > 0) {
				sum = sum + fact(t % 10);
				t = t / 10;
			}
			if (i == sum) {
				System.out.println(i);
			}
		}
	}

}
