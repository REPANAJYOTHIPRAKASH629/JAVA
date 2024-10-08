// //Syntax
// datatype[] arrayname = new datatype[size];

// // Example
// int[] a = new int[5];

import java.util.Scanner;
class Pro82
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int i;
		for(i = 0; i < 5; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Your values are : ");
		for(i = 0; i < 5; i++)
		{
			System.out.println(a[i]);
		}
	}
}