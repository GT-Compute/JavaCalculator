
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScientificCalcDriver value = new ScientificCalcDriver();
		boolean keepGoing = true;
		while (keepGoing)
		{
			System.out.println(value.getCurrentValue());
			int selection = value.displayMenu();
			keepGoing = value.doMenu(selection);
		}
		
	}

}
