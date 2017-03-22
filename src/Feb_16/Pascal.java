package Feb_16;

import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		int n,i,j;
		long a[],b[];
		a= new long[200];
		b = new long[200];
		a[0]=1;
		System.out.println("enter the tree level");
		Scanner input =new Scanner(System.in);
		n = input.nextInt();
		for(j= 0;j<n+1;j++)
		{
			for(i=0;i<j;i++)
			{
				if(i==0||i==j-1)
				{
				b[i]=1;	
				}
				else
				{
					b[i] =a[i]+a[i-1];
				}
				
			System.out.print(b[i]);
			}
			for(i=0;i<j;i++)
			{
			a[i]=b[i];
			}
			System.out.println();
		}
		input.close();
		}
	
	}
