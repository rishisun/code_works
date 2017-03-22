package Feb_28;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		System.out.println("enter the array length");
		int l = n.nextInt();
		System.out.println("enter the string in ascending order");
		int a[] = new int[l];
		for (int k=0;k<l;k++) {
			a[k] = n.nextInt();
		}
		for (int k : a) {
		System.out.println(k);
		}
		System.out.println("enter the number to be found");
		int x = n.nextInt();
		int s = 0;
		int e = l-1;
		int mid = (s + e) / 2;
		while (e >= s) {
			if (x > a[mid]) {
				s = mid + 1;
				mid = (s + e) / 2;
			} 
			else if (x < a[mid]) {
				e = mid-1;
				mid = (s + e) / 2;
			} 
			else if (x == a[mid]) {
				System.out.println("The given number" + x + " is in the list at " + (mid + 1));
				break;
			}
			else{System.out.println("number not found");
			break ;}

		}
		n.close();
	}
}
