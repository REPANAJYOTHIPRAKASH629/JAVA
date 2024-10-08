import java.util.Scanner;
class Pro31
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String st;
		int sal, hra, da, pf, it, gross, net;

		System.out.println("Enter your name : ");
		st = sc.next();
	
		System.out.println("Enter sal, hra, da, pf, it " );
		sal = sc.nextInt();
		hra = sc.nextInt();
		da = sc.nextInt();
		pf = sc.nextInt();
		it = sc.nextInt();
		
		gross = sal + hra + da;
		net = gross - pf - it;
	
		System.out.println("Name is " + st);
		System.out.println("gross is " + gross);
		System.out.println("net is " + net);
        sc.close();
	}
}