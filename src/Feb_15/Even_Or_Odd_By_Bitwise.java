package Feb_15;

import java.util.Scanner;

public class Even_Or_Odd_By_Bitwise {

	public static void main(String[] args) {
		
		int n;
		Scanner input = new Scanner(System.in) ;
		n = input.nextInt();
		if((n&1)==1)
		{
			System.out.println("the number is odd");
		}
		else
		{
			System.out.println("the number is even");
		}
		input.close();
		
		
	}

}
