package com.oops;

public class Bus extends Vehicle{

	@Override
	int NoOfTyer() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	int PersonLodingCapacity() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	int LuggageLodingCapacity() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	float SizeOfVehicleinMeters() {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	String NameOfDriver() {
		// TODO Auto-generated method stub
		return "Bus Driver";
	}

}
