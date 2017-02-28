package Feb_15;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x, temp;
		int j = 0;
		System.out.println("enter the no to checked if it is a prime");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		while (x > 0) {
			temp = x;
			while (temp > 0) {

				if (x % temp == 0) {
					j = j + 1;
				}
				temp = temp - 1;
			}
			if (j == 2) {
				System.out.println(+x);
			}
			x--;
			j=0;
		}
		input.close();
	}

}
