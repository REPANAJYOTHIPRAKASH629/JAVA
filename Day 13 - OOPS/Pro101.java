import java.util.*;
class arith
{
	int a,b;
	double m, n, r;
	
	Scanner sc = new Scanner(System.in);
	
	void read()
	{
		System.out.println("Enter a,b values : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Enter m,n values : ");
		m = sc.nextDouble();
		n = sc.nextDouble();
		
		System.out.println("Enter r value : ");
		r = sc.nextDouble();
	}
	
	void add()
	{
		read();
		System.out.println("Addition is : " + (a+b));
	}
	
	void sub()
	{
		add();
		System.out.println("Subtraction is : " + (a-b));
	}
	
	void mul()
	{
		sub();
		System.out.println("Multiplication is : " + (a*b));
	}
	
	void div()
	{
		mul();
		System.out.println("Division is : " + (a/b));
	}
	
	void circle()
	{
		div();
		System.out.println("Area of circle is : " + (3.14 * r * r));
	}
}

class Pro101
{
	public static void main(String[] args)
	{
		arith x = new arith();
		x.circle();
	}
}