import java.util.Scanner;
class Pro84
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int i;
		System.out.println("ENter array values : ");
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Your values are : ");
		for(i = n; i >= 0; i--)
		{
			System.out.println(a[i]);
		}
	}
}