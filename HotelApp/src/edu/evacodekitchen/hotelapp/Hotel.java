package edu.evacodekitchen.hotelapp;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private List<RoomType> roomTypes;
	private List<Bicycle> bicyles;
	
	private List<Guest> guests;
//	private int currentNrOfGuests = 0;

	public Hotel(List<RoomType> roomTypes, List<Bicycle> bicyles) {
		this.roomTypes = roomTypes;
		this.bicyles = bicyles;
		guests = new ArrayList<>();
	}

	public void addGuest(Guest guest) {
//		currentNrOfGuests++;
		guests.add(guest);
	}

	public int calculateFinalPrice(Guest guest) {
		if (!guests.contains(guest)) 
			throw new GuestNotInThisHotelRuntimeException();
		
		int finalPrice = 0;
		
		Bicycle bicycle = guest.getRentedBicyle();
		if (bicycle != null) {
			int nrOfDaysToRentTheBicycle = guest.getNrOfDaysToRentTheBicycle();
			finalPrice = bicycle.getPricePerDay() * nrOfDaysToRentTheBicycle;			
		}
		
		RoomType rentedRoomType = guest.getRentedRoomType();
		int nrOfDaysToRentTheRoom = guest.getNrOfDaysToRentTheRoom();
		finalPrice += rentedRoomType.getPricePerDay() * nrOfDaysToRentTheRoom;
		
		return finalPrice;
	}

}
