package Feb_24;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci_Of_1000digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the digit");
		n = input.nextInt();
		BigInteger x = new BigInteger("1");
		BigInteger z = new BigInteger("10");
		for (int j = 0; j < n - 1; j++) {
			x = x.multiply(z);
		}
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("0");
		// System.out.println(x);
		// System.out.println(c);
		// System.out.println(b);
		long t = 1;
		while (true) {
			c = a.add(b);
			a = b;
			b = c;
			t++;
			// System.out.println(c);
			if (c.compareTo(x) > 0) {
				System.out.println(c);
				System.out.println(t);
				break;
			}
		}
		input.close();
	}
}
