package Feb_15;

import java.util.Scanner;

/*
 * 2520 is the smallest number that can be divided by each of the numbers 
 * from 1 to 10 without any remainder.
What is the smallest positive number that is 
evenly divisible by all of the numbers from 1 to 20?
*/

public class FactorialUsingRecursion {

	public static int fact(int x) {
		if (x > 1) {
			return x * fact(x - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner x = new Scanner(System.in);
		int y = x.nextInt();
		y = fact(y);
		System.out.println(y);
		x.close();
	}

}
