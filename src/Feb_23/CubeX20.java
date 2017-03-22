package Feb_23;

import java.math.BigInteger;

public class CubeX20 {

	public static void main(String[] args) {
		BigInteger x = new BigInteger("20");
		BigInteger y = new BigInteger("40");
		BigInteger mul = BigInteger.ONE;
		BigInteger mull = BigInteger.ONE;

		BigInteger temp = x;
		while (temp.compareTo(BigInteger.ONE) >= 0) {
			mul = mul.multiply(temp);
			temp = temp.subtract(BigInteger.ONE);
		}
		System.out.println(mul);
		temp = y;
		while (temp.compareTo(BigInteger.ONE) >= 0) {
			mull = mull.multiply(temp);
			temp = temp.subtract(BigInteger.ONE);
		}
		System.out.println(mull);

		mul = mul.multiply(mul);
		mull = mull.divide(mul);
		System.out.println(mull);
	}
}
