// 52
import java.util.Scanner;
class Numbers
{
	public static void main(String[] args)
	{
		int n, i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i = 1; i <= n; i++)
		{
			System.out.println(i);
		}
        sc.close();
	}
}