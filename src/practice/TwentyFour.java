package practice;

class Frog {
	private int id;
	private String name;

	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		/*
		 * StringBuilder s = new StringBuilder();
		 * 
		 * s.append(id).append(" : ").append(name); return s.toString();
		 */
		return String.format("%-4d  :  %s", id, name);

	}
}

public class TwentyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1 = new Frog(7, "Sarah");

		System.out.println(frog1);
		Frog frog2 = new Frog(36, "jobs");
		System.out.println(frog2);

	}

}
