import java.util.*;
public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,product,i=1;
		System.out.print("Enter number: ");
		num=sc.nextInt();
		System.out.println("Table of "+num+ " is:");
		for(i=1;i<=10;i++)
		{
			product=num*i;
			System.out.println(num+ " * "+ (i)+" = "+product);
			
		}
		sc.close();
		
	}

}
