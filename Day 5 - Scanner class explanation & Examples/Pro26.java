import java.util.Scanner;
class Pro26
{
	public static void main(String[] args)
	{
		double m, n , x; 
		Scanner sc = new Scanner(System.in);
		m = sc.nextDouble();
		n = sc.nextDouble();
		x = m / n;
		System.out.println("Division of " + m + " and " + n + " is : " + x);
        sc.close();
	}
}