package practice;

public class TwentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inefficent way
		String info = "";
		info += "My name is bob";
		info += " !";
		System.out.println(info);
		StringBuilder ak = new StringBuilder("");
		ak.append("My name is sue ..");
		ak.append(" !");
		ak.append("\nI am a tiger tammer");
		System.out.println(ak.toString());
		////////////// Formatting of the strings/////////////////////
		System.out.println("this a text \t that was a tab\n that was a new line");

		int a = 9, b = 5;
		System.out.printf("this is to display using variables\n %d,\n%d\n", a, b);

		StringBuilder k = new StringBuilder();
		k.append("hello how do you do").append("\nhello dear").append(" get some sleep");
		System.out.println(k);
	}
}
