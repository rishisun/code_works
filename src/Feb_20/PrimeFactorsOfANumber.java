package Feb_20;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/
public class PrimeFactorsOfANumber {

	public static int check(long a) {

		int flag = 1;
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				flag = 0;
				break;
			}
		}
		return flag;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long max = 0;
		long g = 600851475143L, r = g / 2;
		for (long i = 2; i <= r; i++) {
			if (g % i == 0) {

				int a = check(i);
				if (a == 1) {
					System.out.println(i);
					if (i > max) {
						max = i;
					}
				}
			}
		}
		System.out.println(max);
	}

}
