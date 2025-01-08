package mavensample.JavaReview;
import Lab1.Lab1;
import Lab2.Lab2;
import Lab3.Lab3;
import Lab4.Lab4;
import Lab5.Lab5;
import Lab6.Lab6;
import Lab7.Lab7;

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
	
	public static void problemsSolvedLab3()
	{
		Lab3 lab3Instance = new Lab3();
		lab3Instance.problemsSolved();
	}
	
	public static void problemsSolvedLab4()
	{
		Lab4 lab4Instance = new Lab4();
		lab4Instance.problemsSolved();
		
	}
	
	public static void problemsSolvedLab5()
	{
		Lab5 lab5Instance = new Lab5();
		lab5Instance.problemsSolved();
	}
	
	public static void problemsSolvedLab6()
	{
		Lab6 lab6Instance = new Lab6();
		lab6Instance.problemsSolved();
	}
	
	public static void problemsSolvedLab7()
	{
		Lab7 lab7Instance = new Lab7();
		lab7Instance.problemsSolved();
	}
	
    public static void main( String[] args )
    {
    	int labId = 7;
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
    			break;
    		}
    		case 3:
    		{
    			System.out.print("Lab3 logs:\n");
    			problemsSolvedLab3();
    			break;
    		}
    		case 4:
    		{
    			System.out.print("Lab4 logs:\n");
    			problemsSolvedLab4();
    			break;
    		}
    		case 5:
    		{
    			System.out.print("Lab5 logs:\n");
    			problemsSolvedLab5();
    			break;
    		}
    		case 6:
    		{
    			System.out.print("Lab6 logs:\n");
    			problemsSolvedLab6();
    			break;
    		}
    		case 7:
    		{
    			System.out.print("Lab7 logs:\n");
    			problemsSolvedLab7();
    			break;
    		}
    	}
    }
}