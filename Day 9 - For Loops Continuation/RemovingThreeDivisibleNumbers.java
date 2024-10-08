// 64
import java.util.Scanner;
class RemovingThreeDivisibleNumbers
{
	public static void main(String args[])
	{
		int n, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ");
		n = sc.nextInt();
		for(i=1; i<=n; i++)
		{
			if(i % 3 == 0)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
