package Feb_23;

import java.math.BigInteger;

public class TWo_pwd_1000 {

	public static void main(String[] args) {
		BigInteger n = new BigInteger("2");

		BigInteger n1 = n.pow(1000);
		System.out.println(n1);
		String a;
		a = String.valueOf(n1);
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
			sum = sum + Character.getNumericValue(a.charAt(i));
		}
		System.out.println(sum);
	}

	
}
