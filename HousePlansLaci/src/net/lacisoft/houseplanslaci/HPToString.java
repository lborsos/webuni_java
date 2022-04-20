package net.lacisoft.houseplanslaci;

public class HPToString {
	static int lineLenght = 63;
	static String lineChar = "=";

	public static String convert(HomePlan[] plans) {
		return headerStr() +
				bodyStr(plans) +
				footerStr();
	}
	
	public static String bodyStr(HomePlan[] plans) {
		String body ="";
		for (int i=0; i<plans.length; i++) {
		    if(plans[i] == null) 
		    	break;
		    
		    body = body + String.format("%3d %7.1f %10d %13d %10b %13.1f\n", 
		   		 	plans[i].id,
					plans[i].area,
					plans[i].nrOfBedRooms, 
					plans[i].nrOfBathRooms,
					plans[i].isGarage,
					(HomePlanCalc.calculatePriceForPlan(plans[i])) 
				);
		 /*			body = body + plans[i].id + "  " + 
					plans[i].area + "  " +
					plans[i].nrOfBedRooms + "  " + 
					plans[i].nrOfBathRooms + "  " +
					String.valueOf(HomePlanCalc.calculatePriceForPlan(plans[i])) + "\n"; */
		}
		return body;
	}
	
	public static String headerStr() {
		return lineSeparatorStr() + "\n" +
				" ID   " +
				" Area" +
				" NrOfBedRooms" +
				" NrOfBathRooms" +
				" isGarage" +
				" WorkmanShipCost\n" +
				lineSeparatorStr() + "\n";
	}
	
	public static String footerStr() {
		return lineSeparatorStr() + "\n";
	}
	
	private static String lineSeparatorStr() {
		return lineChar.repeat(lineLenght);
	} 
}
