import java.util.Scanner;
class Pro24
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a and b and c values : ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println("Subtraction of " + a + " and " + b + " and " + c + " is : " + (a-b-c));
        s.close();
    }
}