import java.util.Scanner;
class Pro39
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0))
			System.out.println("Leap year");
		else
			System.out.println("Not Leap year");
        sc.close();
    }
}