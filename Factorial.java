/*
 * Print factorial of a number without iteration
 */

public class FactorialRecursion {
	
	static int fac(int n) {
		  if(n==0) return 1;
	  return n=n*fac(n-1);
	}
	public static void main(String[] args) {
	 System.out.println(fac(4));  

	}

}
