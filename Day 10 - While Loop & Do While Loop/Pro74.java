import java.util.Scanner;
class Pro74
{
	public static void main(String[] args)
	{
		int n, r, m, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		m = n;
		while(n > 0)
		{
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		if( sum == m)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not Palindrome number");
		}
	}
}