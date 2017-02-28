package Feb_23;

import java.math.BigInteger;

public class CubeX20 {
	public static void main(String[] args) {
		BigInteger x = new BigInteger("2");
		BigInteger y = new BigInteger("2");
		for (int i = 0; i < 2000; i++) {
			x = x.add(y);
			x = x.multiply(x);
		}
		System.out.println("hello");
		System.out.println(x.intValue());
	}
}
