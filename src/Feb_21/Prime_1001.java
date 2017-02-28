package Feb_21;

public class Prime_1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, i = 2, j, c = 0, t = 1;
		while (t <= 1001) {
			n = i;
			for (j = 2; j < i; j++) {
				if (n % j == 0) {
					c = 1;
					break;
				}
			}
			if (c == 0) {
				System.out.println(+t + " : " + i);
				t++;
			}

			c = 0;
			i++;
		}
	}

}
