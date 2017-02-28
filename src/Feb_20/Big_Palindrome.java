package Feb_20;

public class Big_Palindrome {

	public static void main(String[] args) {
		/*
		 * A palindromic number reads the same both ways. The largest palindrome
		 * made from the product of two 2-digit numbers is 9009 = 91 × 99. Find
		 * the largest palindrome made from the product of two 3-digit numbers.
		 */
		int x = 999, z, i;

		aa: for (i = 999; i > 0; i--) {
			z = i * x;
			int n = z, j;
			boolean p = true;
			String k = new String();
			k = Integer.toString(n);
			int y = k.length();
			for (j = 0; j < (k.length()) / 2; j++) {
				if (k.charAt(i) == k.charAt(y - 1)) {
					p = true;
				} else {
					p = false;
					break;
				}
				y--;
			}
			if (p == true) {
				System.out.println(k);
				break aa;
			}

		}
	}

}
