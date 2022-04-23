package net.lacisoft.houseplans2;

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
		
}
