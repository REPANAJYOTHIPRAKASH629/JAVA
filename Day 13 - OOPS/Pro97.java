// OOPS - Object Oriented Programming System

// **Object** - Run time entity (object is used for to provide the memory allocation, we can allocate the memory in the JVM environment which has designed class.

// **Class →**  class is a collection of variables & methods, which can be used multiple times


import java.util.*;
class compare
{
	int a, b;
	Scanner sc = new Scanner(System.in);
	void get()
	{
		System.out.println("Enter a , b values");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	
	void put()
	{
		if(a == b)
		{
			System.out.println("Two numbers are equal");
		}
		else if (a > b)
		{
		System.out.println("a is big");
		}	
		else
		{
			System.out.println("b is big");
		}
	}
}

class Pro97
{
	public static void main(String args[])
	{
		compare k = new compare();
		k.get();
		k.put();
	}
}