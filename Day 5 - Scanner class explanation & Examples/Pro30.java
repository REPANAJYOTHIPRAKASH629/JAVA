import java.util.Scanner;
class Pro30
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double p, t, r, simple, total;
		System.out.println("Enter the amount, time, interest");
		p = sc.nextDouble();
		t = sc.nextDouble();
		r = sc.nextDouble();

		simple = (p*t*r) / 100;
		total = p + simple;
		
		System.out.println("Interest is " + simple);
		System.out.println("Total is " + total);
        sc.close();
	}
}