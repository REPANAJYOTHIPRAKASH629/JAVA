//59
// odd numbers sum
import java.util.Scanner;
class OddSum
{
	public static void main(String[] args)
	{
		int n, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		for(i=1; i<=n; i++)
		{
			if( i % 2 != 0)
			{
				sum += i;
			}		
        }
		System.out.println("odd Sum is : " + sum);
	}
}