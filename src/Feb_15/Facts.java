package Feb_15;

import java.util.Scanner;

public class Facts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long j, temp, v = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("given a no.");
		j = input.nextInt();
		System.out.println("given no is " + j);
		temp = j;
		do {
			v = v * temp;
			temp = temp - 1;
		} while (temp > 1);
		System.out.println("the factorial of " + j + " is " + v);
		input.close();
	}

}
