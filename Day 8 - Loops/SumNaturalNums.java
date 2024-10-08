//56
import java.util.Scanner;
class SumNaturalNums
{
	public static void main(String[] args)
	{
		int n, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		for(i=1; i<=n; i++)
		{
			sum += i;
		}
		System.out.println("Sum is : " + sum);
        sc.close();
	}
}