package com.hcl.jorgon_r;

/**
 * Hello world!
 *
 */
public class App 
{
	static int total = 0;
	
	static int ReadArgs(String[] args)
	{
		for ( String s : args )
        {
        	System.out.println(s);
        	total = total + Integer.valueOf(s);
        }
        System.out.println(total);
        return 0;
	}
	
	static void PrintArithmetic(int x, int y)
	{
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
	}
	
	static void ComputeAvg(int x, int y, int z)
	{
		int avg = (x + y + z)/3;
		System.out.println(avg);
	}
	
	static boolean PrimeCheck(int x)
	{
		for (int i = 2; i < x; i++)
		{
			if (x % i == 0) { return false; }
		}
		return true;
	}
	
	static int GetAscii(char c)
	{
		int AsciiVal = (int) c;
		return AsciiVal;
	}
	
	static void FizzBuzz()
	{
		for (int i = 0; i <= 100; i++)
		{
			if ( i % 3 == 0 && i % 5 == 0) { System.out.println("FizzBuzz"); }
			else if (i % 3 == 0) { System.out.println("Fizz"); }
			else if (i % 5 == 0) { System.out.println("Buzz"); }
		}
	}
	
	
    public static void main( String[] args )
    {
        App.ReadArgs(args);
        App.PrintArithmetic(20, 4);
    }
}
