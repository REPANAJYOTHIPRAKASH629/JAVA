import java.util.Scanner;

class Compare {
    int a, b;
    Scanner sc = new Scanner(System.in);
    
    // Method to get values of a and b
    void get() {
        System.out.println("Enter a, b values: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    // Method to compare the values of a and b
    void put() {
        if (a == b) {
            System.out.println("Two numbers are equal");
        } else if (a > b) {
            System.out.println("a is bigger");
        } else {
            System.out.println("b is bigger");
        }
    }
    
    // Inner class Check
    class Check {
        int n;
        Scanner sc = new Scanner(System.in);
        
        // Method to get value of n
        void read() {
            System.out.println("Enter n value: ");
            n = sc.nextInt();
        }
        
        // Method to check if n is even or odd
        void display() {
            if (n % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        }
    }
}

public class Pro103 {
    public static void main(String[] args) {
        // Create an object of the outer class Compare
        Compare k = new Compare();
        k.get();    // Call method to input a and b
        k.put();    // Call method to compare a and b
        
        // Create an object of the inner class Check
        Compare.Check s = k.new Check();
        s.read();   // Call method to input n
        s.display(); // Call method to check if n is even or odd
    }
}
