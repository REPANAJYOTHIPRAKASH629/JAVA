import java.util.Scanner;
class Pro81
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, m, r, sum, f, i, x, c;
		do
		{
			System.out.println("1. Armstrong Number : ");
			System.out.println("2. Palindrome Number : ");
			System.out.println("3. reverse Number : ");
			System.out.println("4. strong Number : ");
			System.out.println("5. sum of n values : ");
			System.out.println("6. Factorial of a Number : ");
			System.out.println("7. Prime Number : ");
			System.out.println("8. Perfect Number : ");
			System.out.println("9. Sum of digits : ");
			System.out.println("10. Armstrong Number : ");
			
			System.out.println("Enter your choice : ");
			x = sc.nextInt();
			
			switch(x)
			{
				case 1 : 
                        sum=0;			
                        System.out.println("Enter n value : ");
                        n = sc.nextInt();
                        m = n;
                        while(n > 0)
                        {
                            r = n % 10;
                            sum = sum + r*r*r;
                            n = n/10;
                        }
                        if( sum == m)
                        {
                            System.out.println("Armstrong number");
                        }
                        else
                        {
                            System.out.println("Not an Armstrong number");
                        }
                        break;
				case 2:			
                        sum=0;
                        System.out.println("Enter n value : ");
                        n = sc.nextInt();
                        m = n;
                        while(n > 0)
                        {
                            r = n % 10;
                            sum = sum * 10 + r;
                            n = n / 10;
                        }
                        if( sum == m)
                        {
                            System.out.println("Palindrome number");
                        }
                        else
                        {
                            System.out.println("Not Palindrome number");
                        }
                        break;
				case 3:
                        sum = 0; 
                        System.out.println("Enter n value : ");
                        n = sc.nextInt();
                        m = n;
                        while(n > 0)
                        {
                            r = n % 10;
                            sum = sum * 10 + r;
                            n = n / 10;
                        }
                        System.out.println("Reverse number : "+ sum);
				case 4:
                        sum = 0; 
                        System.out.println("Enter n value : ");
                        n = sc.nextInt();
                        m = n;
                        while(n > 0)
                        {
                            r = n % 10;
                            n = n / 10;
                            f = 1;
                            while(r > 0)
                            {
                                f = f * r;
                                r--;
                            }
                            sum += f;
                        }
                        if( sum == m)
                        {
                            System.out.println("Strong number");
                        }
                        else
                        {
                            System.out.println("Not Strong number");
                        }
                        break;
				case 5:
                        System.out.println("Enter n value : ");
                        n = sc.nextInt();
                        sum = 0;
                        for(i=1; i<=n;i++)
                        {
                            sum += i;
                        }
                        System.out.println("Sum is " + sum);
                        break;
				case 6:
                        System.out.println("Enter n value : ");
                        n = sc.nextInt();
                        f = 1;
                        for(i=0; i<=n;i++)
                        {
                            f = f * i;
                        }
                        System.out.println("Factorial is " + f);
                        break;
				case 7:
                        System.out.println("Enter n value : ");
                        c=0;
                        n = sc.nextInt();
                        for(i=1; i<=n; i++)
                        {
                            if(n % i == 0)
                            {
                                c++;
                            }
                        }
                        if( c == 2)
                        {
                            System.out.println("Prime Number");
                        }
                        else
                        {
                            System.out.println("Not Prime Number");
                        }
                        break;
				case 8:
                        sum = 0;
                        System.out.println("Enter n value : ");
                        n = sc.nextInt();
                        for(i=1; i<n; i++)
                        {
                            if(n % i == 0)
                            {
                                sum+=i;
                            }
                        }
                        if(sum == n)
                        {
                            System.out.println("Perfect Number");
                        }
                        else
                        {
                            System.out.println("Not Perfect Number");
                        }
                        break;
				case 9:
                        sum = 0;
                        System.out.println("Enter n value : ");
                        n = sc.nextInt();
                        m = n;
                        while(n > 0)
                        {
                            r = n % 10;
                            sum = sum + r;
                            n = n / 10;
                        }
                        System.out.println("Digits number : "+ sum);
                        break;
				case 10:
                        System.exit(0);
                        break;
				default:
						System.out.println("sorru invalid choice!");
			}
		}
		while(x != 10);
	}
}