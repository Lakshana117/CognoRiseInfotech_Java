import java.util.*;
public class CalculatorApp
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.println("Enter first Number :");
			double firstNumber = sc.nextDouble();
			System.out.println("Enter second Number : ");
			double secondNumber =sc.nextDouble();
			//taking double for operating decimal values 
			
			System.out.println("choice + , - , * , / : ");
			char operator =sc.next().charAt(0);//taking first character in next method
			
			switch(operator)
			{
				case  '+' :System.out.println(firstNumber+secondNumber);break;
				case  '-' :System.out.println(firstNumber - secondNumber);break;
				case  '*' :System.out.println(firstNumber * secondNumber);break;
				case  '/' :
					if(secondNumber==0)
					{
						throw new ArithmeticException("Cannot Divisible by Zero");
						//handle the arithmetic exception by throwing the user defined exception
					}
					else {
					System.out.println(firstNumber/secondNumber);
					}
					break;
				default :throw new IllegalArgumentException("\n please enter valid operator...");
 			}
		}
		catch(InputMismatchException e)
		{
			System.err.println("please enter numbers only..");
			//for invalid Number it is handle in input number
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
			//user defined exception is handle here...!
			//by err print as red as a output
		}
		finally //finally block execute compulsory
		{
			sc.close(); //to avoid the warnings
		}
	}
}