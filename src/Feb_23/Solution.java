package Feb_23;

class animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class bird extends animal {
	void fly() {
		System.out.println("i am flying");
	}

	void sing() {
		System.out.println("i am singing");
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal dog = new animal();
		bird parrot = new bird();
		dog.walk();
		parrot.sing();
		parrot.walk();
		parrot.fly();
	}

}
