package Feb_28;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		System.out.println("enter the list length");
		int l = n.nextInt();
		int a[] = new int[l];
		System.out.println("enter the elements");
		for (int i = 0; i < l; i++) {
			a[i] = n.nextInt();
		}
		System.out.println("the numbers are");
		for (int k : a) {
			System.out.println(k);
		}
		int min = 0;
		for (int i = 0; i < l - 1; i++) {
			min = i;
			for (int j = i + 1; j < l; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			if (min != i) {
				int x = a[i];
				a[i] = a[min];
				a[min] = x;
			}
		}
		for (int k : a) {
			System.out.print(k);
			System.out.print(" ");
		}

		n.close();
	}

}
