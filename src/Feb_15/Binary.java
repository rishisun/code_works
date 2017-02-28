package Feb_15;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("enter a no.");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		System.out.println("the binary equivalent " + "is \n"
				+ Integer.toString(x, 2));

		input.close();
	}

}
