// 43

import java.util.Scanner;
class emp
{
	public static void main(String args[])
	{
		double sal, hra, da, pf, it, gross, net;
		String st;
		Scanner sc = new Scanner(System.in);
		st = sc.next();
		System.out.println("Enter sal");
		sal = sc.nextDouble();
		if(sal <= 10000)
		{
			hra = sal * 0.12;
			da = sal * 0.08;
			pf = sal * 0.04;
			it = sal * 0.02;
		}
		
		else if(sal > 10000 && sal <= 20000)
		{
			hra = sal * 0.16;
			da = sal * 0.11;
			pf = sal * 0.07;
			it = sal * 0.04;
		}
		
		else if(sal > 20000 && sal <= 30000)
		{
			hra = sal * 0.21;
			da = sal * 0.15;
			pf = sal * 0.1;
			it = sal * 0.07;
		}
		
		else if(sal > 30000 && sal <= 40000)
		{
			hra = sal * 0.25;
			da = sal * 0.2;
			pf = sal * 0.15;
			it = sal * 0.1;
		}
		else if(sal > 40000 && sal <= 50000)
		{
			hra = sal * 0.34;
			da = sal * 0.3;
			pf = sal * 0.26;
			it = sal * 0.22;
		}
		
		else
		{
			hra = sal * 0.38;
			da = sal * 0.33;
			pf = sal * 0.29;
			it = sal * 0.25;
		}
		
		gross = sal + hra + da;
		net = gross - pf - it;
		
		System.out.println("Name is : " + st);
		System.out.println("Salary is : " + sal);
		System.out.println("hra is : " + hra);
		System.out.println("da is : " + da);
		System.out.println("pf is : " + pf);
		System.out.println("it is : " + it);
		System.out.println("gross is : " + gross);
		System.out.println("net is : " + net);
        sc.close();
	}
}			