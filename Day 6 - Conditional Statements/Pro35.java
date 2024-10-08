import java.util.Scanner;
class Pro35
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		if(n > 10)
			System.out.println("Welcome to the class : ");
		System.out.println("Hi how are you!");
        sc.close();
	}
}