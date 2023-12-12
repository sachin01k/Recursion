
public class ExpoRecursion{

	static double expo(double n, int e)
	{
		if(e == 1)
			return n * e;

		return n * expo(n,e-1);
	}

	public static void main(String[] args) {
		
		double n = 3.5;
		int e = 4;

		System.out.println("Base : " + n+ " Exponent : " + e + " Exponentiation : " + expo(n,e));
	}
}