/*
 * 0 1 1 2.........89 (Fibonacci Series)
 */
public class Q6 {

	public static void main(String[] args) {
		int a=0,b=1,i;
		
        for( a=0;a<=89;)
        {
        	
        	System.out.print(a+" ");
          	i=a;
        	a=b;
        	b=i+a;
        }
	}

}
