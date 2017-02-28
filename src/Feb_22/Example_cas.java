package Feb_22;
class robot{
	public void speak(String text){
		System.out.println(text);
		
	}
}

public class Example_cas {

	public static void main(String[] args) {
		robot x = new robot();
		String a="Hello Asshole\nhow you doing?";
		x.speak(a);
	}

}