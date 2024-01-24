package First;

public class Fibonacci {

	public static void main(String[] args) 
		     {
		        int n = 10; // You can change this value to the desired number of terms

		        System.out.println("Fibonacci sequence up to " + n + " terms:");

		        for (int i = 0; i < n; i++) {
		            System.out.print(fibonacci(i) + " ");
		        }
		    }

		    public static int fibonacci(int n) {
		        if (n <= 1) {
		            return n;
		        } else {
		            return fibonacci(n - 1) + fibonacci(n - 2);
		        }
		    }
		


	}


