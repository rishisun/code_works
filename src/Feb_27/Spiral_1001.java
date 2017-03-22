package Feb_27;

/*
 * Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

		21 22 23 24 25
 		20 7  8  9  10
 		19 6  1  2  11
 		18 5  4  3  12
		17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

 * 
 * */
public class Spiral_1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l, d = 0, t = 1, sum = 1;
		for (l = 1; l < 1001; l = l + 2) {
			d = d + 2;
			for (int p = 0; p < 4; p++) {
				t = t + d;
				// System.out.println(t);
				sum = sum + t;
			}
		}
		System.out.println(sum);
	}

}
