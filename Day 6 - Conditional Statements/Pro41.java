import java.util.Scanner;
class Pro41
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a == b)
			System.out.println("two numbers are equal");
		else if(a > b)
			System.out.println("a is big");
		else
			System.out.println("b is big");
        sc.close();
		}
	}