package Feb_23;
public class Collatz {

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
