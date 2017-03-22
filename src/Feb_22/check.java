package Feb_22;

import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = { "zero ", "one ", "two ", "there ", "four ", "five ", "six ", "seven ", "eigth ", "nine ",
				"ten ", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixtenn", "seventeen", "eighteen",
				"nineteen", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety ",
				"hundred ", "thousand ", "and " };
		int count[] = { 4, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 9, 8, 6, 6, 6, 5, 5, 7, 6, 6, 7, 8, 3 };
		int n = 0, temp = 0, tens, hundreds, thousand, ones;
		System.out.println("enter the positive number till thousand");
		for (n = 1; n < 1001; n++) {
			temp = n;
			if (n < 21) {
				System.out.print(n + " : ");
				System.out.println(words[n]);
				System.out.println(count[n]);
			} else if (n < 100) {
				tens = (temp / 10);
				tens = (tens - 2) + 20;
				ones = temp % 10;
				System.out.print(n + " : ");
				if (ones != 0) {
					System.out.println(words[tens] + words[ones]);
					System.out.println(count[tens] + count[ones]);
				} else {
					System.out.println(words[tens]);
					System.out.println(count[tens]);
				}

			} else if (n < 1000) {
				hundreds = temp / 100;
				temp = temp - hundreds * 100;
				tens = (temp / 10);
				tens = (tens - 2) + 20;
				ones = temp % 10;
				System.out.print(n + " : ");
				if (ones != 0) {
					System.out.println(words[hundreds] + words[28] + words[30] + words[tens] + words[ones]);
					System.out.println(count[hundreds] + count[28] + count[30] + count[tens] + count[ones]);
				} else {
					System.out.println(words[hundreds] + words[28] + words[30] + words[tens]);
					System.out.println(count[hundreds] + count[28] + count[30] + count[tens]);

				}
			} else {
				thousand = temp / 1000;
				temp = temp - thousand * 1000;
				hundreds = temp / 100;
				temp = temp - hundreds * 100;
				tens = (temp / 10);
				tens = (tens - 2) + 20;
				ones = temp % 10;
				System.out.print(n + " : ");
				if (ones != 0) {
					System.out.println(words[thousand] + words[30] + words[hundreds] + words[28] + words[30]
							+ words[tens] + words[ones]);
					System.out.println(count[thousand] + count[30] + count[hundreds] + count[28] + count[30]
							+ count[tens] + count[ones]);
				} else {
					System.out.println(
							words[thousand] + words[30] + words[hundreds] + words[28] + words[30] + words[tens]);
					System.out.println(
							count[thousand] + count[30] + count[hundreds] + count[28] + count[30] + count[tens]);

				}

			}
		}

	}

}
