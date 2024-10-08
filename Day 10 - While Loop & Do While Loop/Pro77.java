// strong num
import java.util.Scanner;
class Pro
{
	public static void main(String[] args)
	{
		int n, r, f, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		int m = n;
		while(n > 0)
		{
			r = n % 10;
			n = n / 10;
			f = 1;
			while(r > 0)
			{
				f = f * r;
				r--;
			}
			sum += f;
		}
		if( sum == m)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not Strong number");
		}
	}
}