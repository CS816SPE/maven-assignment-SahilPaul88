package com.mycompany.app;

/**
 * Hello world!
 *
 */



public class App
{
	public static void main(String args[])
	{
		int res,a,b,choice;
		
		
		 a=Integer.parseInt(args[0]);
		 b=Integer.parseInt(args[1]);
		 choice=Integer.parseInt(args[2]);		
		
			System.out.println("1.Multiplication");
			System.out.println("2.Add");
			System.out.println("3.Subtract");
			System.out.println("4.exit");
			System.out.println("enter your choice");
			
			switch(choice)
			{
				case 1: res=a*b;
				System.out.println("product is"+res);
				break;
 			
				case 2:
				res=a+b;
				System.out.println("sum is"+res);
				break;	
				
				case 3:
				res=a-b;
				System.out.println("difference is"+res);
				break;
				case 4: System.exit(0);
					break;
				default: System.out.println("invalid choice");

			}
			
	}
}



