package Mar_2;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int t;
		String d = "";

		for (int i = 1; i <= 1000000; i++) {
			t = i;
			d = Integer.toString(t);
			String d1 = new StringBuffer(d).reverse().toString();
			if (d.equals(d1)) {
				ArrayList<Integer> a = new ArrayList<Integer>();
				t = i;
				while (t > 0) {
					a.add(t % 2);
					t = t / 2;
				}
				ArrayList<Integer> b = new ArrayList<Integer>(a);
				Collections.reverse(a);
				// System.out.println(a);
				if (a.equals(b)) {
					sum = sum + i;
					System.out.println(b + "\t" + i + "\t" + a);
				}

			}

		}
		
		System.out.println(sum);
		
	}

}
