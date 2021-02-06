import java.util.Scanner;



public class ScientificCalcDriver extends Value {
	
	//private double currentValue;
	
	public boolean doMenu(int selection)
	
		{
			
			
			if (selection == 1)
				add(getOperand("What would you like to add to your current value: "));
			if (selection == 2)
				subtract(getOperand("What would you like to subtract your value by: "));
			if (selection == 3)
				multiply(getOperand("What would you like to mulitply your value by: "));
			if (selection == 4)
				divide(getOperand("what do you want to divide your value by: "));		
			if (selection == 5)
				power(getOperand("To the power of what?: "));
			
			if (selection == 6)
				log();	
			if (selection == 7)					
				clear();
			if (selection == 8)
			{
				return false;
			}
			return true;
		}
	
	
	public static int displayMenu()
	{
		Scanner scan = new Scanner(System.in);
		int selection = 0;
		text("Menu");
		text("1. Add");
		text("2. Subtract");
		text("3. Multiply");
		text("4. Divide");
		text("5. Power");
		text("6. Logarithm");
		text("7. Clear");
		text("8. Quit");
		while (selection<=0 || selection >8)
		{
			System.out.print("Please enter your selection: ");
			selection = scan.nextInt();
			if (selection<=0 || selection >8)
				text("Please enter a valid number");
		}
		return selection;
	}
	public ScientificCalcDriver()
	{
		currentValue=0;
	}
	private static void text(String prompt)
	{
		System.out.println(prompt);
	}
	public void power(double operand2)
	{
		
		currentValue = Math.pow(currentValue, operand2);
		
	}
	public void log()
	{
		currentValue = Math.log(currentValue);
	}
}
