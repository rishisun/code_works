package Feb_15;

import java.util.Scanner;

public class Consecutive_amstrong {

	public static void main(String[] args) {

		int x, temp, j, i = 0, v;

		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// getting the input number
		System.out.println("give a number");
		// reading the input number
		x = input.nextInt();
		System.out.println("let's get the consecutive " + "amstrong numbers till the given number" + x);
		j = x;
		while (j > 0) {
			temp = j;
			while (temp > 0) {
				v = temp % 10;
				i = i + v * v * v;
				temp = temp / 10;

			}
			// check's if it is an amstrong number.
			if (j == i) {
				System.out.println("####the numbers are" + i);
			}
			// else
			// {System.out.println("it's not the number"+j);}
			i = 0;
			j--;
		}
		input.close();
	}
}
