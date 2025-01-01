package Lab1;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public final class Lab1 {

public List<String> programingLaguages =  new ArrayList<String>();
public int randomNumber;

public Lab1() 
{
	super();
	this.programingLaguages.add("C");
	this.programingLaguages.add("C++");
	this.programingLaguages.add("C#");
	this.programingLaguages.add("Python");
	this.programingLaguages.add("Go");
	this.programingLaguages.add("Rust");
	this.programingLaguages.add("JavaScript");
	this.programingLaguages.add("PHP");
	this.programingLaguages.add("Swift");
	this.programingLaguages.add("Java");
	this.randomNumber = 0;
}

public void helloWord()
{
	System.out.print("helloWord(): Hello World !" + "\n");
}

public void generateRandomNumber()
{
	this.randomNumber = (int)(Math.random()*1_000_000);
	System.out.print("generateRandomNumber(): Generated value by Math.random is:" + randomNumber + "\n");
}

public void opertaionAponRandomNumber()
{
	this.randomNumber *= 3;
	System.out.print("opertaionAponRandomNumber(): Multiply the number by 3 new value: " + this.randomNumber +"\n");
	
	this.randomNumber += 10101;
	System.out.print("opertaionAponRandomNumber(): Add to the number 10101 new value: " + this.randomNumber + "\n");

	this.randomNumber += 0xFF;
	System.out.print("opertaionAponRandomNumber(): Add to the number 0xFF new value: " + this.randomNumber + "\n");
	
	this.randomNumber *= 6;
	System.out.print("opertaionAponRandomNumber(): Multiply the number by 6 new value: " + this.randomNumber + "\n");
	
	int sumDigitsValue =sumDigits();
	System.out.print("opertaionAponRandomNumber(): Sum of digits number " + sumDigitsValue + "\n");
	
	System.out.print("opertaionAponRandomNumber(): Willy -milly this semester i will learn "+ programingLaguages.get(sumDigitsValue) + "\n");
	
}

public int sumDigits()
{
	int returnInstance = this.randomNumber; 
	if (this.randomNumber >= 9)
	{
		do 
		{
			int copyNumber= returnInstance;
			returnInstance = 0;
			while(copyNumber != 0)
			{
				returnInstance += copyNumber % 10;
				copyNumber /=10;
			}
		}while(returnInstance > 9);
		
	}
	return returnInstance;
}
	
}
