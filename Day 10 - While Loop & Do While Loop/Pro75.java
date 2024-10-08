import java.util.Scanner;
class Pro75
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
			sum = sum * 10 + r;
			n = n / 10;
		}
		System.out.println("Reverse number : "+ sum);
	}
}