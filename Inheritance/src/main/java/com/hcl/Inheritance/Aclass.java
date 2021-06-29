package com.hcl.Inheritance;

class Aclass 
{
	String whosTalking()
	{
		return "this is Aclass.";
	}
	
	int whosNumber()
	{
		return 100;
	}
	
	boolean whosRight()
	{
		return false;
	}
}

class Bclass extends Aclass
{
	@Override
	int whosNumber()
	{
		return 200;
	}
	
	@Override
	boolean whosRight()
	{
		return true;
	}
}

class Cclass extends Bclass
{
	@Override
	String whosTalking()
	{
		return "this is Cclass.";
	}
}