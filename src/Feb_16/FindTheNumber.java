package Feb_16;

import java.util.Scanner;
/*
-> Write a program to find if a given number is present in a set of numbers.
*/

public class FindTheNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 15, 5, 5, 3, 4, 3, 5, 1, 5, 24, 1, 6, 5, 13, 5, 2, 4, 8, 11, 6,
				1, 8, 6, 1, 8, 1, 6, 5, 46, 6, 5 };
		System.out.println("enter the number to find");
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		int c = 0, v = 0;
		for (int k : a) {

			if (k == n) {
				System.out.println("number found");
				v++;
			}
			c++;
		}
		System.out.print("number was found");
		System.out.print(v);
		System.out.print("times");

	}

}
