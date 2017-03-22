package Feb_25;

public class Amicable_Number {

	public static void main(String[] args) {
		//wrong
		int i = 10000;
		int[] a = new int[400000];
		int n = 1, sum = 0, sum1 = 0;
		for (int k = 2; k <= i; k++) {
			while (n < k) {
				if (k % n == 0) {
					sum = sum + n;
				}
				n++;
			}
			n = 1;
			while (n < sum) {
				if (sum % n == 0) {
					sum1 = sum1 + n;
				}
				n++;
			}
			if (n == sum1&&sum!=sum1) {
				System.out.println(sum + "\n" + sum1+"\n************* ");
				a[sum] = 1;
				a[sum1] = 1;
			}
			sum = 0;
			sum1 = 0;
			n = 1;
		}
		for (int k = 2; k <= i; k++) {
			if (a[k] == 1) {
				System.out.println(k);
			}

		}
	}

}
