import java.util.Scanner;

public class NumDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		if(num<=1)
		{
			System.out.println("one");
		}
		else if(num<=10)
		{
			System.out.println("ten");
		}
	else if(num<=100)
	{
		System.out.println("hundred");
	}
	else if (num<=1000)
	{
		System.out.println("thousand");
	}
	sc.close();
		
	}

}
