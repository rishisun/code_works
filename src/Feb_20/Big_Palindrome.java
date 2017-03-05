package Feb_20;

public class Big_Palindrome {

	public static void main(String[] args) {
		/*
		 * A palindromic number reads the same both ways. The largest palindrome
		 * made from the product of two 2-digit numbers is 9009 = 91 × 99. Find
		 * the largest palindrome made from the product of two 3-digit numbers.
		 */
		int x = 999, z = 0, i,c;
		int imax,xmax,max=0;
		String a = "", y = "";
		aa: for (i = 999; i > 1; i--) {
			for (x = 999;x>1;x--) {
				z = i * x;
				a = Integer.toString(z);
				for (c = a.length() - 1; c >= 0; c--) {
					y = y + a.charAt(c);
				}
				if (a.equals(y)) {
					if(z>max)
					{max =z;
					imax=i;
					xmax =x;}
					else{
						break;
					}
					System.out.println(a);
				}
				y ="";
			}
		}
		System.out.println(max+"!!!!!");
	}
}