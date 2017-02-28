package Feb_20;

public class Sum_Of_Factors_3_5_V2 {

	public static void main(String[] args) {
		int sum=0,sum1=0,sum3 =0;
		for(int i=3;i<1000;i = i+3){
			sum = sum + i;
		}
		for(int i=5;i<1000;i = i+5){
			sum1 = sum1 + i;
		}for(int i=15;i<1000;i =i +15){
			sum3 = sum3 + i;
		}
		sum = sum+sum1-sum3;
		System.out.println(sum);
	}

}
