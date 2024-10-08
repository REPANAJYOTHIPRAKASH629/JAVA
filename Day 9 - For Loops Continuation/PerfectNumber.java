// 62
// perfect number (factors sum equal to same number )
// ex : (6) -> 1 + 2 + 3 = 6
import java.util.Scanner;
class PerfectNumber
{
	public static void main(String args[])
	{
		int n, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=1; i<n; i++)
		{
			if(n % i == 0)
			{
				sum+=i;
			}
		}
		if( sum == n)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect Number");
		}
	}
}