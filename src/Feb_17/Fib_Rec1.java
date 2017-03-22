package Feb_17;

import java.util.Scanner;

public class Fib_Rec1 {
	
	static int a=0,b=1,c=0;
	static void rec(int n){
		if (n>0){
			System.out.print(c+" ");
			a = b ;
			b = c ;
			c = a + b;
			n--;
			rec(n);
		}
	}
	public static void main(String[] args) {
		int n;
		System.out.println("enter the no.. of no.. ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		rec(n);
		input.close();
	}
}
