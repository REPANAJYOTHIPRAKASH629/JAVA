
//71
import java.util.Scanner;
class Pattern7
{
	public static void main(String[] args)
	{
		int n, i, j, k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
}