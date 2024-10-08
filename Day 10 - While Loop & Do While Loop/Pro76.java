// individual digit sum
import java.util.Scanner;
class Pro76
{
	public static void main(String[] args)
	{
		int n, r, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		while(n > 0)
		{
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println("Digits number : "+ sum);
	}
}