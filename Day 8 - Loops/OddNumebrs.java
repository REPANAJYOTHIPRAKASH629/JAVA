//55
import java.util.Scanner;
class OddNumbers
{
	public static void main(String[] args)
	{
		int n, i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		for(i=1; i<=n; i++)
		{
			if( i % 2 != 0)
			{
				System.out.println(i);
			}
		}
        sc.close();
	}
}