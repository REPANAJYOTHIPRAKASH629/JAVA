import java.util.Scanner;
class Pro96
{
	public static void main(String[] args)
	{
		int i, j, x, y;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns: ");
		x = sc.nextInt();
		y = sc.nextInt();
		 
		int[][] a = new int[x][y];
		
		System.out.println("Enter matrix values : "); 
		for(i=0;i<2;i++)
		{
			for(j=0; j<2; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array values are : "); 
		for(i=0;i<2;i++)
		{
			for(j=0; j<2; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}