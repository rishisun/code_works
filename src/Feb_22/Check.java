package Feb_22;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10000, i;
		boolean p = true;
		String k = new String();
		k = Integer.toString(n);
		int y = k.length();
		for (i = 0; i < (k.length()) / 2; i++) {
			if (k.charAt(i) == k.charAt(y - 1)) {
				p = true;
			} else {
				p = false;
				break;
			}
			y--;
		}
		if (p == true) {
			System.out.println(k);
		}
	}

}
