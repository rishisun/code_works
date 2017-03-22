package Feb_24;

public class Calender {
	// getting the wrong dates
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 0;
		int c = 0;
		int d = 2;
		for (int y = 1901; y < 2001; y++) {
			if (y % 100 == 0) {
				if (y % 400 == 0) {
					l = 1;
				} else
					l = 0;
			}
			if (y % 4 == 0) {
				l = 1;
			} else {
				l = 0;
			}
			for (int i = 1; i < 13; i++) {
				switch (i) {
				case 1:
					d = d + 3;
					break;
				case 2:
					d = d + l;
					break;
				case 3:
					d = d + 3;
					break;
				case 4:
					d = d + 2;
					break;
				case 5:
					d = d + 3;
					break;
				case 6:
					d = d + 2;
					break;
				case 7:
					d = d + 3;
					break;
				case 8:
					d = d + 3;
					break;
				case 9:
					d = d + 2;
					break;
				case 10:
					d = d + 3;
					break;
				case 11:
					d = d + 2;
					break;
				case 12:
					d = d + 3;
					break;
				}
				if (d > 5) {
					d = (d % 6 - 1);
				}
				if (d == 0) {
					if (i < 12) {
						System.out.println(1 + "-" + (i + 1) + "-" + y);
					} else
						System.out.println(1 + "-" + (i % 11) + "-" + (y + 1));
					c++;
				}
			}

		}
		System.out.println("number of are:");
		System.out.println(c);
	}
}
