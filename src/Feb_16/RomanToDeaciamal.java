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

public class RomanToDeaciamal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		System.out.println("enter the roman number");
		Scanner n = new Scanner(System.in);
		String r = n.nextLine();
		r = r.toUpperCase();
		int l = r.length();
		int a = 0, b = 0;
		for (int i = 0; i < l; i++) {
			char j = r.charAt(i);
			switch (j) {
			case 'M':
				num = num + 1000;
				b = 1000;
				break;

			case 'D':
				num = num + 500;
				b = 500;
				if (a < b) {
					num = num - 2*a;
				}
				break;

			case 'C':
				num = num + 100;
				b = 100;
				if (a < b) {
					num = num - 2*a;
				}
				break;

			case 'L':
				num = num + 50;
				b = 50;
				if (a < b) {
					num = num - 2*a;
				}
				break;

			case 'X':
				num = num + 10;
				b = 10;
				if (a < b) {
					num = num - 2*a;
				}
				break;

			case 'V':
				num = num + 5;
				b = 5;
				if (a < b) {
					num = num - 2*a;
				}
				break;

			case 'I':
				num = num + 1;
				b = 1;
				
				break;
			}
			a = b;
		}
		System.out.println(num);
		n.close();
	}
	

}
