package Feb_23;
public class Collatz {

	/*
	*•	The following iterative sequence is defined for the set of positive integers:
	n → n/2 (n is even)
	n → 3n + 1 (n is odd)
Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
Although it has not been proved yet (Collatz Problem), it is thought that all starting
 numbers finish at 1.
Which starting number, under one million, produces the longest chain?
NOTE: Once the chain starts the terms are allowed to go above one million.

	*
	*
	*
	*
	*
	*
	*
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n, tg = 0, ig = 0, t = 0;
		for (long i = 1; i <=1000000; i++)
		{
		n = i;
		while (n > 0) {
			if (n % 2 == 0){
			t++;
			n = n / 2;
			} 
			else if (n == 1){
			t++;
				if (t > tg){
				tg = t;
				ig = i;
				}
			t = 0;
			break;
			} 
			else{
			t++;
			n = 3 * n + 1;
			}
			}
		}
		System.out.print(ig + " :---> ");
		System.out.println(tg);

	}

}
