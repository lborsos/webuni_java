package edu.evacodekitchen.hotelapp;

import java.util.Objects;

public class Guest {

	@Override
	public int hashCode() {
		return Objects.hash(name, nrOfDaysToRentTheBicycle, nrOfDaysToRentTheRoom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guest other = (Guest) obj;
		return Objects.equals(name, other.name) && nrOfDaysToRentTheBicycle == other.nrOfDaysToRentTheBicycle
				&& nrOfDaysToRentTheRoom == other.nrOfDaysToRentTheRoom;
	}

	private String name;
	private RoomType rentedRoomType;
	private int nrOfDaysToRentTheRoom;
	private Bicycle rentedBicycle;
	private int nrOfDaysToRentTheBicycle;

	public Guest(String name, RoomType rentedRoomType, int nrOfDaysToRent) {
		this.name = name;
		this.rentedRoomType = rentedRoomType;
		this.nrOfDaysToRentTheRoom = nrOfDaysToRent;
	}

	public void rentBicycle(Bicycle bicycle, int nrOfDaysToRent) {
		this.rentedBicycle = bicycle;
		this.nrOfDaysToRentTheBicycle = nrOfDaysToRent;
	}

	public Bicycle getRentedBicyle() {
		return rentedBicycle;
	}

	public int getNrOfDaysToRentTheBicycle() {
		return nrOfDaysToRentTheBicycle;
	}

	public RoomType getRentedRoomType() {
		return rentedRoomType;
	}

	public int getNrOfDaysToRentTheRoom() {
		return nrOfDaysToRentTheRoom;
	}

}
