package Feb_15;

import java.util.Scanner;
//incomplete*********

/*
Write function that translates a text to Pig Latin and back.
English is translated to Pig Latin by taking the first letter of every word, 
moving it to the end of the word and adding ‘ay’.
 “The quick brown fox” becomes “Hetay uickqay rownbay oxfay”

*/
public class Pig_Latin_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String l = new String();
		System.out.println("enter a string to convert to pig latin from english");
		Scanner input = new Scanner(System.in);
		l = input.nextLine();
		String s[] = l.split(" ");
		for (String k : s) {
			k = k.substring(1)+k.charAt(0)+"ay";
			System.out.print(k+"\t");
		}
		input.close();
	}

}
