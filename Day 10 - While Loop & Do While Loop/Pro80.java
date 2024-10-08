// dowhile
import java.util.Scanner;
class Pro9
{
	public static void main(String[] args)
	{
		int n, i=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		do
		{
			System.out.println(i);
			i++;
		}
		while(i <= n);
	}
}