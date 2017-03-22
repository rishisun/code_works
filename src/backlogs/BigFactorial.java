package backlogs;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {

	public static void main(String[] args) {
		
		
		
		BigInteger j; 
		BigInteger temp=BigInteger.ZERO; 
		BigInteger v = BigInteger.ONE;
		//BigInteger temp=BigInteger.ONE;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a No:");
		j = input.nextBigInteger();
		System.out.println("Given no is " + j);
		temp=j;
		do {
		
			v = v .multiply(temp) ;
			temp = temp.subtract(BigInteger.ONE);
		}while (temp.compareTo(BigInteger.ONE) >0); 
		System.out.println("The factorial of " + j + " is " + v);
		input.close();
	}
		
		
		
		
		
	}

