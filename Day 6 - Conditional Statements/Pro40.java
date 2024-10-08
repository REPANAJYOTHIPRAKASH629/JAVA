import java.util.Scanner;
class Pro40
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n == 0)
			System.out.println("It is a zero");
		else if(n > 0)
			System.out.println("It is a +ve number");
		else
			System.out.println("It is a -ve numebr");
        sc.close();
	}
}