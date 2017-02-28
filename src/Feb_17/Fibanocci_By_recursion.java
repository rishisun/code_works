package Feb_17;

import java.util.Scanner;
public class Fibanocci_By_recursion
{
	static void frec(int n)
	{
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	for(int i=2;i<=n;i++)
	{

			int c =a + b;
			a = b;
			b = c;
			System.out.println(c);
	}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no.. of no.. ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		frec(n);
		
		System.out.println("thank u");
		input.close();
	}

}
