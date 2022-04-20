package net.lacisoft.houseplanslaci;

public class CalcWorkmanshipCost {
	HomePlan homePlan;
	float bedRoomPrice = 200f; 
	float bathRoomPrice = 100f;
	float garagePrice = 50f;
	float areaUnitPrice = 10f;

	public CalcWorkmanshipCost(HomePlan homePlan) {
		this.homePlan = homePlan;
	}
	
	public float Calc() {
		return CalcArea() + CalcBedrooms() + CalcBathrooms() + CalcGarage();
	}
	
	private float CalcArea() {
		return homePlan.area * areaUnitPrice;
	}
	
	private float CalcBedrooms() {
		return homePlan.nrOfBedRooms * bedRoomPrice;
	}

	private float CalcBathrooms() {
		return homePlan.nrOfBathRooms * bathRoomPrice;
	}

	private float CalcGarage() {
		return homePlan.isGarage ? garagePrice : 0f;
	}
	
}
