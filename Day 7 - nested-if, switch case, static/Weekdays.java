//46
import java.util.Scanner;
class Weekdays
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		switch(n)
		{
			case 1 : System.out.println("Monday");
			break;
			case 2 : System.out.println("Tuesday");
			break;
			case 3 : System.out.println("Wednesday");
			break;
			case 4 : System.out.println("Thurday");
			break;
			case 5 : System.out.println("Friday");
			break;
			case 6 : System.out.println("Saturday");
			break;
			case 7 : System.out.println("Sunday");
			break;
			default : System.out.println("Invalid week day number " );
		}
        sc.close();
	}
}