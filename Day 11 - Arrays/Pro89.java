//sum of odd array values
import java.util.Scanner;
class Pro89
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int i, sum = 0;
		System.out.println("ENter array values : ");
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Your values are : ");
		for(i = 0; i < n; i++)
		{
			if(a[i] % 2 != 0)
				sum += a[i];
		}
		System.out.println("Sum of array values : " + sum);
	}
}