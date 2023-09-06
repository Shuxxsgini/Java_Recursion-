import java.util.*;
public class Factorial {

    public static void main(String[] args) 
    {
    	int num, factorial ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        num=sc.nextInt();
       
         factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
           
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
        sc.close();
    }
}