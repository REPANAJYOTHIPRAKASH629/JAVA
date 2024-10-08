// ascending order
import java.util.Scanner;
class Pro93
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int i, j, t;
		System.out.println("ENter array values : ");
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(i = 0; i < n; i++)
		{
			for(j =i+1; j<n; j++)
			{
				if(a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("Ascending array values are: ");
		for(i = 0; i < n; i++)
		{
			System.out.println(a[i]);
		}
	}
}