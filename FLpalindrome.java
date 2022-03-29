import java.util.Scanner;

public class FLpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,x,i,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		num=sc.nextInt();
		x=num;
		for(i=0;num>0;num/=10)
		{
		rem=num%10;
		i=(i*10)+rem;
		}
		if(i==x)
		{
		 System.out.println(x+" is a palindrome number ");
		}
		else
		{
			System.out.println(x+" is not a palidrome number ");
			
		}
		sc.close();
		 
		
		
		
		
	}

}
