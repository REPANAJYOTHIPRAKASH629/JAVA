// 47
import java.util.Scanner;
class SwitchCase
{
	public static void main(String args[])
	{
		int a, b, x;
		double m, n, r;

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Addition ");
		System.out.println("2. Subtraction ");
		System.out.println("3. Multiplcation ");
		System.out.println("4. Division ");
		System.out.println("5. Area of Circle ");
		System.out.println("6. Volume of Sphere ");
		System.out.println("7. Compare of two values ");
		System.out.println("8. Even or Odd ");
		System.out.println("9. +ve or -ve ");
		System.out.println("10. Leap year or not");
		System.out.println("11. exit");
		
		System.out.println("Enter your choice : ");
		x = sc.nextInt();
		switch(x)
		{
		    case 1 :
                    System.out.println("Enter a, b values : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Addition is " + (a+b));
                    break;
		    case 2 :
                    System.out.println("Enter a, b values : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Subtraction is " + (a-b));
                    break;
		    case 3 :
                    System.out.println("Enter a, b values : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Multiplication is " + (a * b));
                    break;				
		    case 4 :
                    System.out.println("Enter m, n values : ");
                    m = sc.nextDouble();
                    n = sc.nextDouble();
                    System.out.println("Division is " + (m/n));
                    break;				
		    case 5 : 
                    System.out.println("Enter r value : ");
                    r = sc.nextDouble();
                    System.out.println("Area of circle is " + (3.14 * r * r));
                    break;
		    case 6 : 
                    System.out.println(" Enter r value : ");
                    r = sc.nextDouble();
                    System.out.println("Volume of sphere is " + (1.33 * 3.14 * r * r * r));
                    break;
		    case 7 : 
                    System.out.println("Enter a, b value : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    if (a ==b)
                        System.out.println("two numbers are equal");
                    else if(a > b)
                        System.out.println("a is big");
                    else
                        System.out.println("b is big");
                    break;
		    case 8 :
                    System.out.println("Enter a value : ");
                    a = sc.nextInt();
                    
                    if(a % 2 == 0)
                        System.out.println("Even number");
                    else
                        System.out.println("Odd number");
                    break;
		    case 9 :
                    System.out.println("Enter a value : ");
                    a = sc.nextInt();
                    if(a == 0)
                        System.out.println("zero");
                    else if(a > 0)
                        System.out.println("+ve");
                    else 
                        System.out.println("-ve");
                    break;
		    case 10:
                    System.out.println("Enter a value : ");
                    a = sc.nextInt();
                    if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
                        System.out.println("leap year");
                    else
                        System.out.println("not leap year");
                    break;
		    case 11: 
                    System.exit(0);
					break;
		    default : 
                    System.out.println("Sorry");
		}
        sc.close();
	}
}							