import java.util.Scanner;
class Pro73
{
	public static void main(String[] args)
	{
		int n, r, m, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		m = n;
		while(n > 0)
		{
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		if( sum == m)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}
	}
}