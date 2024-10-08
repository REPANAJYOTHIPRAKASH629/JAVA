import java.util.Scanner;
class Pro25
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a and b and c values : ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		System.out.println("multiplication of " + a + " and " + b + " and " +  c + " and " + d + " is : " + (a * b * c * d));
        s.close();
    }
}