package net.lacisoft.houseplanslaci;

public class HomePlanCalc {
	final static float bedRoomUnitPrice = 200f; 
	final static float bathRoomUnitPrice = 100f;
	final static float garagePrice = 50f;
	final static float areaUnitm2Price = 10f;
	
	public static float calculatePriceForPlan(HomePlan plan) {
		float calc;
		calc = plan.isGarage ? garagePrice : 0f;
		calc += plan.nrOfBathRooms * bathRoomUnitPrice;
		calc += plan.nrOfBedRooms * bedRoomUnitPrice;
		calc += plan.area * areaUnitm2Price;
		
	  return calc;
	}
	
	
/*
	float bedRoomUnitPrice = 200f; 
	float bathRoomUnitPrice = 100f;
	float garagePrice = 50f;
	float areaUnitm2Price = 10f;

	float workmansipCost;
	
	public HomePlanCalc(HomePlan homePlan) {
		super(homePlan);
		workmansipCost = Calc();
	}

	public HomePlanCalc(int id, float area, int nrOfBedRooms, int nrOfBothRooms, boolean isGarage) {
		super(id, area, nrOfBedRooms, nrOfBothRooms, isGarage);
		workmansipCost = Calc();
	}

	public float Calc() {
		return CalcArea() + CalcBedrooms() + CalcBathrooms() + CalcGarage();
	}
	
	private float CalcArea() {
		return area * areaUnitm2Price;
	}
	
	private float CalcBedrooms() {
		return nrOfBedRooms * bedRoomUnitPrice;
	}

	private float CalcBathrooms() {
		return nrOfBathRooms * bathRoomUnitPrice;
	}

	private float CalcGarage() {
		return isGarage ? garagePrice : 0f;
	}
	*/
	
	
	
}
