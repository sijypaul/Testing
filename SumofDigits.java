// Java program to compute
// sum of digits in number.
import java.io.*;

class SumofDigits {

	/* Function to get sum of digits */
	static int getSum(int n)
	{
		int sum;

		/* Single line that calculates sum */
		for (sum = 0; n > 0; sum += n % 10, n /= 10)
			;

		return sum;
	}

	// Driver code
	public static void main(String[] args)
	{
		int n = 68781;

		// Function call
		System.out.println(getSum(n));
	}
}


