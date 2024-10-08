// to find out n-student grades

import java.util.*;
class Student
{
	int m, p, c, tot;
	double avg;
	String st;
	
	Scanner sc = new Scanner(System.in);
	
	void read()
	{
		System.out.println("Enter name " );
		st = sc.next();
	
		System.out.println("Enter m, p, and c marks : " );
		m = sc.nextInt();
		p = sc.nextInt();
		c = sc.nextInt();	
	}
	
	void display()
	{
		tot = m + p + c;
		avg = tot / 3;
		
		System.out.println("Name is : " + st);
		System.out.println("Total is : " + tot);
		System.out.println("Average is : " + avg);
	}
	
	void grade()
	{
		if(m >= 35 && p >= 35 && c >= 35)
		{
			if(avg >= 60)
				System.out.println("First class");
			else if( avg >= 45 && avg <= 60)
				System.out.println("Second class");
			else if( avg >= 35 && avg <= 45)
				System.out.println("Third class");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}


class Pro102
{
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		Student s = new Student();
		for(i=1; i<=n; i++)
		{
			s.read();
			s.display();
			s.grade();
		}	
	}
}