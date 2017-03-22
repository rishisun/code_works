package Feb_27;

public class Longest_Repetition {

	int a[] = new int[100];
	int r=0,n=0;
	void call(int x,int y){
		y = (y*10)%x;
		if(y==0)
		{
			
			for(int k:a){
			System.out.println(a[k]);
			}
			r= n =0;
			
		}
		else
		{
			if(a[y]==0){
				r++;}
			else{
				n++;}
			a[y]=1;
			call(x,y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<1000;i++){
			
		}
	}

}
