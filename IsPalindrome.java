/*
 * To Check whether the number is palindrome
 */
import java.util.*;

public class IsPalindrome {
	public static void main(String[]args)
	{
     Scanner sc=new Scanner(System.in);
     
	 int num , c = 0, r;
	 System.out.print("Enter Number=");
	 num=sc.nextInt();
	 int a = num;
     for (; num != 0;) {
	      r = num % 10;
	      c =c * 10 + r;
	      num /= 10;
	    }
	    
	   
	    if (a == c) {
	      System.out.println(a+ " is Palindrome.");
	    }
	    else {
	      System.out.println(a + " is not Palindrome.");
	      
	    }
	    sc.close();
	  }
	
	
	}