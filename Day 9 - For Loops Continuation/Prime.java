//61
// prime number
import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int n, i, c = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=1; i<=n; i++)
		{
			if(n % i == 0)
			{
				c++;
			}
		}
		sc.close();
		if( c == 2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	}
}