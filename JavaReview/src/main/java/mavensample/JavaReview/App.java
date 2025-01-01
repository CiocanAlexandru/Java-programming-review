package mavensample.JavaReview;
import Lab1.Lab1;
import Lab2.Lab2;

public class App 
{
	public static void problemsSolvedLab1()
	{
		Lab1 lab1Instance = new Lab1();
		lab1Instance.helloWord();
		lab1Instance.generateRandomNumber();
		lab1Instance.operatiAponRandomNumber();
	}
	
	public static void problemsSolvedLab2()
	{
		Lab2 lab2Instance = new Lab2();
		lab2Instance.problemsSolved();
	}
	
    public static void main( String[] args )
    {
    	int labId = 2;
    	switch (labId)
    	{
    		case 1:
    		{
    			System.out.print("Lab1 logs:\n");
    			problemsSolvedLab1();
    			break;
    		}
    		case 2:
    		{
    			System.out.print("Lab2 logs:\n");
    			problemsSolvedLab2();
    		}
    	}
    }
}