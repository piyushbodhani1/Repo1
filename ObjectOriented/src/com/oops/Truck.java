package com.oops;

public class Truck extends Vehicle{

	@Override
	int NoOfTyer() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	int PersonLodingCapacity() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	int LuggageLodingCapacity() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	float SizeOfVehicleinMeters() {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	String NameOfDriver() {
		// TODO Auto-generated method stub
		return "TruckDriver";
	}

}
