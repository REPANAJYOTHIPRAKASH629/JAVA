// 53
import java.util.Scanner;
class ReverseOrder
{
	public static void main(String[] args)
	{
		int n, i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		for(i = n; i > 0; i--)
		{
			System.out.println(i);
		}
        sc.close();
	}
}