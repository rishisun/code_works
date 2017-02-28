package Feb_17;

import java.util.Scanner;

public class Bitwise_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		n = n & 1;
		if (n == 1) {
			System.out.println("given no is odd");
		} else {
			System.out.println("given no. is even");
		}
		input.close();
	}

}
