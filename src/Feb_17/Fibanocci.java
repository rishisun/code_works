package Feb_17;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		long n, a = 0, b = 1,c = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the no.of digits u want");
		n = input.nextInt();
		do{
			System.out.println(c);
			c = a+b;
			a = b;
			b = c;
			n--;
		}while(n>0);
		input.close();
	}

}
