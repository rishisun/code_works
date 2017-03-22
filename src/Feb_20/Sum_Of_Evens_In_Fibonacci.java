package Feb_20;

public class Sum_Of_Evens_In_Fibonacci {

	public static void main(String[] args) {
		int v = 4000000;
		int sum=0,a=0,b=1,c=0;
		while(c<v){
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			if(c%2==0){
				sum =sum +c;
			}
		}
		System.out.println("Here is sum of even in fibanocci!!!");
		System.out.println(sum);
	}

}
