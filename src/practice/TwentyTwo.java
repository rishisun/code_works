package practice;

class thing {
	public final static int LUCKY_number = 3;
	public String name;
	public static String description;
	public int id;
	public static int count;

	public thing() {
		id = count;
		count++;
	}

	void Show() {
		System.out.println("ID : " + id);
		System.out.print(description);
		System.out.println(name);
	}
}

public class TwentyTwo {
	public static void main(String[] args) {

		System.out.println("before the object creation  count : " + thing.count);
		thing.description = "this thing is : ";
		thing thing1 = new thing();
		thing thing2 = new thing();
		thing1.name = "bob";
		thing2.name = "jasmine";
		thing1.Show();
		thing2.Show();
		System.out.println(Math.PI);
		System.out.println(thing.LUCKY_number);
		System.out.println("After the object creation  count : " + thing.count);
	}
}