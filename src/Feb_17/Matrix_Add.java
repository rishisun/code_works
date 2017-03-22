package Feb_17;

public class Matrix_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		 int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{9,8,7},{6,5,4},{3,2,1}};
		int [][]c = new int [3][3];
		int [][]d = new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Addition fo matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println( "mul of matrix");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
				d[i][j] = d[i][j] + a[i][k]*b[j][k]; 
				}
			}
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.println(d[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("inverse of matrix");
		
		
		
		
		
		
		
		
	}

}
