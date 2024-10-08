// 44
import java.util.Scanner;
class Student
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m, p, c, tot;
		double avg;
    String st;

		System.out.println("Enter your name : ");
		st = sc.next();

		System.out.println("Enter m, p, c marks : ");
		m = sc.nextInt();
		p = sc.nextInt();
		c = sc.nextInt();
		
		tot = m + p + c;
		avg = tot / 3;
	
		System.out.println("Name is " + st);
		System.out.println("Total is " + tot);
		System.out.println("Average is " + avg);
		
		if(m >= 35 && p >= 35 && c >= 35)
		{
			if(avg >= 60)
			{
				System.out.println("First class");
			}
			else if(avg >= 45 && avg < 60)
			{
				System.out.println("Second class");
			}
			else
			{
				System.out.println("third class");
			}
		}
		else
		{
			System.out.println("Failed");
		}
        sc.close();
	}
}		
