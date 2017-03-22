package Feb_15;

import java.util.Scanner;

public class Binlogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, i = 0, j, temp;
		System.out.println("enter the no.");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		int[] a;
		a = new int[16];
		temp = x;
		while (temp >= 0 && i < 16) {
			if (temp % 2 == 0) {
				a[i] = 0;
			} else {
				a[i] = 1;
			}
			temp = temp / 2;
			 if (temp == 0){
				 break;}
			 i++;
		}
		System.out.println("the binary equivalent is");
		for (j =i; j >= 0; j--) {
			System.out.print(+a[j]);
		}
		input.close();
	}
}
