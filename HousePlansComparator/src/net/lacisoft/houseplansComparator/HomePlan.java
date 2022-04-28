package net.lacisoft.houseplansComparator;

public class HomePlan {
	int id;
	float area;
	int nrOfBedRooms;
	int nrOfBathRooms;
	boolean isGarage;
	
	public HomePlan(int id, float area, int nrOfBedRooms, int nrOfBathRooms, boolean isGarage) {
		this.id = id;
		this.area = area;
		this.nrOfBedRooms = nrOfBedRooms;
		this.nrOfBathRooms = nrOfBathRooms;
		this.isGarage = isGarage;
	}

	public HomePlan(HomePlan homePlan) {
		this.id = homePlan.id;
		this.area = homePlan.area;
		this.nrOfBedRooms = homePlan.nrOfBedRooms;
		this.nrOfBathRooms = homePlan.nrOfBathRooms;
		this.isGarage = homePlan.isGarage;
	}

	public String toString() {
		return "HomePlan [id=" + id + ", area=" + area + ", nrOfBedRooms=" + nrOfBedRooms + ", nrOfBathRooms=" + nrOfBathRooms + ", isGarage=" + isGarage;
	}
}
