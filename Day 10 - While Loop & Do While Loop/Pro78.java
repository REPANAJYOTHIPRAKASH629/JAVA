// fibonaaci series
import java.util.Scanner;
class Pro78
{
	public static void main(String[] args)
	{
		int n, t1 = 0, t2 = 1, t3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		System.out.println(t1);
		System.out.println(t2);
		t3 = t1 + t2;
		while(t3 <= n)
		{
			System.out.println(t3);
			t1 = t2;
			t2 = t3;
			t3 = t1 + t2;
		}
	}
}