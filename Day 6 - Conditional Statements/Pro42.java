import java.util.Scanner;
class Pro42
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a == b && a == c)
			System.out.println("three numbers are equal");
		else if(a > b && a > c)
			System.out.println("a is big");
		else if(b > c)
			System.out.println("b is big");
		else 
			System.out.println("c is big");	
        sc.close();		
		}
	}