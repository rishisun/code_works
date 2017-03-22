package Feb_28;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length");
		Scanner n = new Scanner(System.in);
		int l = n.nextInt();
		int a[] = new int[l];
		System.out.println("enter the numbers");
		for (int i = 0; i < l; i++) {
			a[i] = n.nextInt();
		}
		for (int i = 0; i < l; i++) {
			for (int j = 1; j < l - i; j++) {
				if (a[j - 1] > a[j]) {
					int k = a[j - 1];
					a[j - 1] = a[j];
					a[j] = k;
				}
			}
		}
		for (int h : a) {
			System.out.println(h);
		}

		n.close();
	}

}
