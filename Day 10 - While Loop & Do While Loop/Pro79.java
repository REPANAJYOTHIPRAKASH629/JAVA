import java.util.Scanner;
class Pro79
{
	public static void main(String[] args)
	{
		int x, y, p = 1, k = 1;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		while( k <= y)
		{
			p = p * x;
			k++;
		}
		System.out.println("X to the power of y is " + p);
	}
}