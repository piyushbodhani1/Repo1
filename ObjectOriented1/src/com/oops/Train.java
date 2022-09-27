package com.oops;

public class Train implements RatingsOfTheTrain , PantryInTheTrain{

	@Override
	public int pantryRatings() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public String pantryFoods() {
		// TODO Auto-generated method stub
		return "malaipanner";
	}

	@Override
	public int hygineratins() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int ratings() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String status() {
		// TODO Auto-generated method stub
		return "Running";
	}

	@Override
	public int luxry() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String pricing() {
		// TODO Auto-generated method stub
		return "High";
	}
	public static void main(String args[])
	{
		Train t = new Train();
		t.luxry();
		t.hygineratins();
		t.pantryFoods();
		t.status();
	}

}
