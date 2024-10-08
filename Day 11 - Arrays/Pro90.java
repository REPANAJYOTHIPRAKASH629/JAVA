//replacing value with index based array values
import java.util.Scanner;
class Pro9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int i, in, re;
		
		System.out.println("ENter array values : ");
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
	
		System.out.println("Enter index value : ");
		in = sc.nextInt();
		System.out.println("Enter replace value : ");
		re = sc.nextInt();
		
		for(i=0; i<n; i++)
			if(i == in)
				a[i] = re;

		System.out.println("Your values are : ");
		for(i = 0; i < n; i++)
		{
			System.out.println(a[i]);
		}
	}
}