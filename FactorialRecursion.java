import java.math.BigInteger;


public class FactorialRecursion{

	//for values in capacity if Integer
	static int fact(int n)
	{
		if(n == 1)
			return n;

		return n * fact(n-1);
	}

	// for values above capacity of integer
	static BigInteger fact(BigInteger n)
	{
		BigInteger n1 = new BigInteger("1");
		if(n.intValue() == 1)
			return n;
 
		return n.multiply(fact(n.subtract(n1)));
	}

	public static void main(String[] args) {
		Integer n = 4;
		System.out.print("Factorial of "+ n + " is " + fact(new BigInteger(n.toString())));
	}
}