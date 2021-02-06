import java.util.Scanner;


public class Value
{
		public double currentValue;

		public static int displayMenu()
		{
			Scanner scan = new Scanner(System.in);
			int selection = 0;
			text("Menu");
			text("1. Add");
			text("2. Subtract");
			text("3. Multiply");
			text("4. Divide");
			text("5. Clear");
			text("6. Quit");
			while (selection<=0 || selection >6)
			{
				System.out.print("Please enter your selection: ");
				selection = scan.nextInt();
				if (selection<=0 || selection >6)
					text("Please enter a valid number");
			}
			return selection;
		}
		public Value()
		{
			currentValue=0;
		}
		public static double getOperand(String prompt)
		{
			Scanner scan = new Scanner(System.in);
			double number = 0;
			System.out.print(prompt);
			number = scan.nextDouble();
			return number;
		}
		public double getCurrentValue()
		{
			return currentValue;
		}
		public void add(double operand2)
		{
			currentValue += operand2;
		}
		public void subtract(double operand2)
		{
			currentValue -= operand2;
		}
		public void multiply(double operand2)
		{
			currentValue = currentValue * operand2;
		}
		public void divide(double operand2)
		{
			if (operand2 != 0)
			{
			currentValue = currentValue / operand2;
			}
			else
				text("ERROR can not divide by Zero");
		}
		private static void text(String prompt)
		{
			System.out.println(prompt);
		}
		
		
		
		
		
		public void clear()
		{
			currentValue = 0;
		}
}
