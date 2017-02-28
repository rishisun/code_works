package Feb_15;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, j = 0, v;
		Scanner p = new Scanner(System.in);
		System.out.println("enter the no.");
		int x = p.nextInt();
		System.out.println("u entered " + x);
		System.out.println("let us check the no. is amstrong or not");
		
		temp = x;
		while (temp > 0) {
			v = temp % 10;
			j = j + v * v * v;
			temp = temp / 10;
		}
		if (j == x) {
			System.out.println("hurrai !!"
					+ "\n given no. %d  is anamestrong no." + x);
		} else {
			System.out.println("#######given no is not an amestrong######");
			System.out.println(+j+" " + x);
	
		}
		
		p.close();
	}
	

}
