package Feb_22;

/*
 * Find the sum of all the primes below two million.
*/
public class Sum_prime_2Million {
	public static int check(long a) {
		int temp;
		for (temp = 2; temp < a; temp++) {
			if (a % temp == 0) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 2L;
		for (long i = 3L; i<2000000; i = i + 2) {
			if (check(i) == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}