package Feb_15;

import java.util.Scanner;

public class Morrse_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char e[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
				'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ' };
		String m[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
				"---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
				"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "|" };
		String ans = "";
		System.out.println(
				"if you want to convert english to morse press\n1. \nelse " + "press 2. for  morse to english");
		Scanner input = new Scanner(System.in);
		ans = input.nextLine();

		if (ans.equalsIgnoreCase("1")) {
			System.out.println("enter the String");
			ans = input.nextLine();
			for (int i = 0; i < ans.length(); i++) {

				for (int j = 0; j < e.length; j++) {
					if (ans.charAt(i) == e[j]) {
						System.out.print(m[j]);
						break;
					}
				}
			}
		}

		else {
			System.out.println("enter the code");
			ans = input.nextLine();
			String k[] = ans.split("|");
			for (String l : k) {
				bb: 
					for (int j = 0; j < k.length; j++) {
					if (l.equalsIgnoreCase(m[j])) {
						System.out.print(e[j]);
						break bb;
					}
					//System.out.print(" ");
				}
			}
		}

		input.close();
	}

}
