package Feb_15;

/*
 *-> Learn about Bit Wise operators AND, OR , XOR, COMPLEMENT,
 *Left Shit and Right Shift operators
  -> write a program to convert a decimal to binary and count leading zeros 
  -> using bitwise operator swap two numbers
*/
public class BitwiswOperator {
	public static void main(String[] args) {
		int a = 3, b = 6;
		int c = a & b;
		System.out.println(c);
		c = a ^ b;
		System.out.println(c);
		c = a | b;
		System.out.println(c);
		c = c << 2;
		System.out.println(c);
		c = c >> 2;
		System.out.println(c);
		System.out.println(20 >>> 2);
		System.out.println(-20 >>> 2);
		//part two numbe 27 number of leading zeros
		
		
	}

}
