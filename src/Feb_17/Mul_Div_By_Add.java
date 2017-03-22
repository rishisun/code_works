package Feb_17;

import java.util.Scanner;

public class Mul_Div_By_Add {

	public static void main(String[] args) {
		int a, b, i, temp, c = 0, x, count = 0;
		Scanner input = new Scanner(System.in);
		aa: for (;;) {
			
			System.out
					.println("enter what you want to \n1.multiply\n2.add\n3.Divide\n4.quit");
			x = input.nextInt();
			
			if(x==4){
				break aa;
			}
			else if(x==1||x==2||x==3)
			{
			System.out.println("enter two numbers");
			a = input.nextInt();
			b = input.nextInt();
				if(x == 1){
				for (i = 0; i < a; i++) {
					c = c + b;
					}
				System.out.println("the product of the numbers");
				System.out.println(a + " and  " + b + " is :");
				System.out.println(c);
				c = 0;
			}
				else if (x == 2) {
					c = a + b;
					System.out.println("the sum of the numbers");
					System.out.println(a + " and  " + b + " is :");
					System.out.println(c);
					c=0;
				}
			else if (x == 3) {
				temp = a;
				while(a >= b){
					a = a - b;
					count++;
				}
				System.out.println(temp+ " divided by " + b);
				System.out.println("qoutient is :" + count);
				System.out.println("Remainder is :" +a);

				count = 0;
			} 
			}
			else
			{
				System.out.println("#########error input not recognized########\n^^^^^^^^^^^^^^^^\nenter appropriate one");
				System.out.println();
			}
			System.out.println();
			}
		
		input.close();
	}
}
