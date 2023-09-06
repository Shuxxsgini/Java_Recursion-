import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int a=0,b,c;
		System.out.print("Enter a Number: ");  		 
		int num=sc.nextInt();  
		c=num;
		if(c==0)
		{
			if(num==a)
				
			{
				System.out.println("Yes, Its an Armstrong Number. :)");
			}
			else
			{
				System.out.println("No, Not an Armstrong Number. :(");
			}
			
			
			{
				b=c%10;
				c=c/10;
				a=a+(b*b*b);
			}
			
		}
		sc.close();
		 

	}

}
