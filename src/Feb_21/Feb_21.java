package Feb_21;
public class Feb_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, k = 0;
		long sum = 0;
		for (i = 1; i < 101; i++) {
			k = k + i * i * i;
		}
		System.out.println("sum of the cumbes till 100\n" + k);
		for (i = 1; i < 101; i++) {
			sum = sum + i;
		}
		sum = sum * sum * sum;
		System.out.println("cube of the sum till 100\n"+ sum);
		System.out.println("difference between these is ");
		sum = sum-k;
		System.out.println(sum);
	}

}
