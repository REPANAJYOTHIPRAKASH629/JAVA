//swapping

import java.util.Scanner;
class Pro32
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, t;
		a = sc.nextInt();
		b = sc.nextInt();
		t = a;
		a = b;
		b = t;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
        sc.close();
	}
}