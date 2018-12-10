
public class BackpackRunner {
	private void packAndCheck()
	{
		// Your mission is to go to school.
		// 1. First you need to put all your supplies into your backpack - use the putInBackpack(...) methods
		Backpack backpack = new Backpack();
		backpack.putInBackpack(new Pencil());
		backpack.putInBackpack(new Ruler());
		backpack.putInBackpack(new Textbook());
		backpack.goToSchool();
	}

	public static void main(String[] args)
	{
		new BackpackRunner().packAndCheck();
	}
}
