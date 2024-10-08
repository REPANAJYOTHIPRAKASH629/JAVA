import java.util.Scanner;
class Pro72
{
	public static void main(String[] args)
	{
		int n, i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		System.out.println("n values are : ");
		while(i <= n)
		{
			System.out.println(i);
			i++;
		}
	}
}