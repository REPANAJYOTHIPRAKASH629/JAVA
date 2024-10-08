 // 45
import java.util.Scanner;
class seasons
{
	public static void main(String[] args)
	{
		int n;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		switch(n)
		{
			case 11:
			case 12:
			case 1 :
			case 2 : System.out.println("Winter");
				 
			case 3:
			case 4:
			case 5 :
			case 6 : System.out.println("Summer");
				 
			case 7:
			case 8:
			case 9 :
			case 10 : System.out.println("Rainy");
				 
			default : System.out.println("Invalid month number");
		}
        sc.close();		
	}
}	