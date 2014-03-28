package fr.epsi.TestWizzBuzz;

public class WizzBuzz {
	
	public String getResult(int i)
	{
		if (i%15 == 0)
			return "WizBuzz";
		if (i%3 == 0)
			return "Wiz";
		if (i%5 == 0)
			return "Buzz";
		
		return String.valueOf(i);
	}

}
