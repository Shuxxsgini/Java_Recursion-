import java.util.*;
public class ReverseNumb {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r=0;
		System.out.print("Enter Number that you want to be reversed: ");
		int num=sc.nextInt();
		
		
		 for(;num != 0; num /= 10) {
		      int digit = num % 10;
		      r = r * 10 + digit;
		    }

		    System.out.println("Reversed Number: " + r);
		    sc.close();
		
	}
}

