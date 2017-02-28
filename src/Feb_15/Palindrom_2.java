package Feb_15;

import java.util.Scanner;

public class Palindrom_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		String x ="";
		String y ="";
		System.out.println("enter the string ");
		Scanner input = new Scanner(System.in);
		x = input.nextLine();
		System.out.println("given string");
		System.out.println(x);
		for (i=0 ;i < x.length() ;i++) {
			x.charAt(i);
		}
		if ( x.equals(y)) {
			System.out.println("given String is palindrome");
		} else {
			System.out.println("given string is not palindrome");
		}
		input.close();
	}

}
