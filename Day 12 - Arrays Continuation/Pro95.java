// // syntax
// datatype[][] arrayname = new datatype[rowsize][columnsize]

// //example
// int[][] arr = new arr[2][2];

import java.util.Scanner;
class Pro95
{
	public static void main(String[] args)
	{
		int i, j;
		int[][] a = new int[2][2];
		Scanner sc = new Scanner(System.in);
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