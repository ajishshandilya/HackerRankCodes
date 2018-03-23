import java.util.Scanner;

public class MatrixDiagonal 
{

	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the the of matrix:");
	int n=scan.nextInt();
	int k=0;
	int mat[][]=new int[n][n];
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			k++;
			mat[i][j]=k;
			if(k<10){
				System.out.print(k+"  ");
			}
			else{
			System.out.print(k+" ");
			}
		}
		System.out.println();
		
	}
	int count=0;
	System.out.println("Sum of their diagonals:");
	while(count<n+n-1)
	{
		int sum=0;
		for (int i = 0; i < n; i++)
		{
			
			for (int j = 0; j < n; j++)
			{
				if(i+j==count)
				{
					sum=sum+mat[i][j];
				}
			}
		}
		System.out.println(sum);
		count++;
	}
	}

}
