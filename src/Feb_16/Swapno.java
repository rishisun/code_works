package Feb_16;

import java.util.Scanner;

public class Swapno {

	public static void main(String[] args) {
		
		int a,b;
		Scanner input =new Scanner(System.in);
		System.out.println("enter two no.");
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("given no.are \na = "+a+"\nb = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		input.close();
	}

}
