package Feb_16;

import java.util.Scanner;

/*
 *  Write a program to convert a given decimal to a Roman number.
 * 1=I,		1
 * 4=IV,	2
 * 5=V,		3
 * 9=IX,	4
 * 10=X,	5
 * 40=XL,	6
 * 50=L,	7
 * 90=XC,	8
 * 100=C,	9
 * 400=CD,	10
 * 500=D,	11
 * 900=CM,	12
 * 1000=M	13
 * 
 * 
 */
public class RomanToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner n = new Scanner(System.in);
		int x = n.nextInt();
		int temp = x;
		String a[] = { "", "I", "IV", "V", "IX", "X", "XL", "L", "XC","C", "CD", "D", "CM", "M" };
		while (temp > 0) {
			if (temp >= 1000) {
				System.out.print(a[13]);
				temp = temp - 1000;
			} else if (temp >= 900) {
				System.out.print(a[12]);
				temp = temp - 900;
			} else if (temp >= 500) {
				System.out.print(a[11]);
				temp = temp - 500;
			} else if (temp >= 400) {
				System.out.print(a[10]);
				temp = temp - 400;
			} else if (temp >= 100) {
				System.out.print(a[9]);
				temp = temp - 100;
			} else if (temp >= 90) {
				System.out.print(a[8]);
				temp = temp - 90;
			} else if (temp >= 50) {
				System.out.print(a[7]);
				temp = temp - 50;
			} else if (temp >= 40) {
				System.out.print(a[6]);
				temp = temp - 40;
			} else if (temp >= 10) {
				System.out.print(a[5]);
				temp = temp - 10;
			} else if (temp >= 9) {
				System.out.print(a[4]);
				temp = temp - 9;
			} else if (temp >= 5) {
				System.out.print(a[3]);
				temp = temp - 5;
			} else if (temp >= 4) {
				System.out.print(a[2]);
				temp = temp - 4;
			} else {
				System.out.print(a[1]);
				temp = temp - 1;
			}

		}

		n.close();
	}

}
