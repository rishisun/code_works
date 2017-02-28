package Feb_19;

import java.util.Scanner;

public class List_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j, k = 0, l;
		
			System.out.println("enter numbers of terms");
			Scanner input = new Scanner(System.in);
			j = input.nextInt();
			int[] a = new int[j];
			System.out.println("enter the numbers ");
			for (i = 0; i < j; i++) {
				a[i] = input.nextInt();
			}
			System.out.println("what operation you what to perform");
			System.out.println("1.addition");
			System.out.println("2.reverse of the list"
					+ "\n3. head and tail of the list"
					+ "\n4.middle element of the list"
					+ "\n5.divid list in two equal halfs");
			l = input.nextInt();
			switch (l) {
			case 1:
				for (i = 0; i < j; i++) {
					k = k + a[i];
				}
				System.out.println(k);
				break;
			case 2:
				for (i = j - 1; i >= 0; i--) {
					System.out.println(a[i] + " ");
				}
				break;
			case 3:
				System.out.println("head = " + a[0] + "\n tail = " + a[j - 1]);
				break;
			case 4:
				if (j % 2 == 0) {
					System.out.println(a[(j / 2)-1] + " and " + a[j / 2]);
				} else {
					System.out.println(a[(j / 2)]);
				}
				break;
			case 5:
				System.out.println("list one ");
				if (j % 2 == 0) {
					for (i = 0; i < (j / 2); i++) {
						System.out.println(a[i]);
					}
					System.out.println("list 2");
					for (; i < j; i++) {
						System.out.println(a[i]);
					}
				} else {
					for (i = 0; i < (j / 2) + 1; i++) {
						System.out.println(a[i]);
					}
					System.out.println("list 2");
					for (; i < j; i++) {
						System.out.println(a[i]);
					}
				}
				break;
			default:
				System.out.println("wrong input");
				break;
			}
			input.close();

		}
}
