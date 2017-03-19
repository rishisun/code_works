package practice;

class tuna {

	private int hours;
	private int minutes;
	private int seconds;

	void setMillitary(int h, int m, int s) {
		hours = ((h >= 0 || h <= 24) ? h : 0);
		minutes = ((m >= 0 || m <= 60) ? m : 0);
		seconds = ((s >= 0 || s <= 60) ? s : 0);
	}

	void getMillatarty() {
		System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
		System.out.println();
	}

	void gettime() {
		System.out.printf("%02d:%02d:%02d :%s", ((hours < 12) ? hours : hours % 12), (minutes), (seconds),
				((hours < 12) ? "AM" : "PM"));
		System.out.println();
	}

}

public class MilltaryTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tuna t1 = new tuna();
		t1.getMillatarty();
		t1.gettime();
		t1.setMillitary(13, 58, 30);
		t1.getMillatarty();
		t1.gettime();

	}

}
