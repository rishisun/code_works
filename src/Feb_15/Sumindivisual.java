package Feb_15;

import java.util.Scanner;

public class Sumindivisual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, temp, i;
		System.out.println("enter a no.");
		Scanner j = new Scanner(System.in);
		i = j.nextInt();
		System.out.println("given no is " + i);
		System.out.println("the sum of the digits is");
		temp = i;
		while (temp > 0) {
			x = x + temp % 10;
			temp = temp / 10;
		}
		System.out.println(+x);
		j.close();
	}

}
