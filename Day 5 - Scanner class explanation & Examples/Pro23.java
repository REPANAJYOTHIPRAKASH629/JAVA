// Scanner 

// import java.util.Scanner;

// Scanner sc = new Scanner(System.in);

// nextInt()

// nextDouble()

// next()

// nextLine()

import java.util.Scanner;
class Pro23
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b values : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition of " + a + " and " + b + " is : " + (a+b));
        sc.close();
	}
}