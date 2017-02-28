package Feb_16;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// initialize no.
		int i, n;
		// scan the no.
		System.out.println("enter a no.");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		// find the factories
		for (i = n; i > 0; i--) {
			if (n % i == 0) {
				// display factors
				System.out.println(i);
			}
		}
		// close scanner
		input.close();
	}

}
