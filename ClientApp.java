/*2) define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will throw exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above.*/



package exception;

import java.util.Scanner;

class MyArithException extends Exception
{
	public MyArithException(String string)
	{
		super(string);
	}
}
class Calculator
{
public double caldouble(int a)throws MyArithException
{
if(a==0)
{
throw new MyArithException("zero is not allowed");	
}
else if(a<0)
{
throw new MyArithException("-ve is not allowed");
}
return a;
}
}
public class ClientApp {

	public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter a no");
			int a =input.nextInt();	
		Calculator  ref = new Calculator();
		try
		{	
		double res=ref.caldouble(a);
		System.out.println(res);
		}
		catch(MyArithException e)
		{
			System.out.println(e);
		}
	}
}

