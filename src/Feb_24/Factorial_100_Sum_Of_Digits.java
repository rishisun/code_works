package Feb_24;

import java.math.BigInteger;

public class Factorial_100_Sum_Of_Digits {

	public static void main(String[] args) {
		int i = 100;
		BigInteger digit=BigInteger.ZERO;
		BigInteger sum=BigInteger.ZERO;
		BigInteger z = new BigInteger("1");
		BigInteger x = new BigInteger("1");
		BigInteger y = new BigInteger("1");
		for (int j = 0; j < i; j++) {
			x = x.multiply(y);
			y = y.add(z);
		}
		System.out.println(x);
		while(x.compareTo(BigInteger.ZERO)>0)
		{
			digit=x.remainder(BigInteger.TEN);
			sum=sum.add(digit);
			x=x.divide(BigInteger.TEN);
			
		}
		System.out.println(sum);
	}

}
