package net.lacisoft.covidvaccination;

import java.time.LocalDate;

public enum CovidVaccination {
	SZPUTNYIK(90, 2), PFIZER(21, 3), MODERNA(30, 2), OXFORD(15, 4), SINOPHARM(21, 2), JOHNSON(0, 1), CONVIDECIA(45, 2);

	private int nrOfDaysBetweenVaccination;
	private int numberOfDosesRequired;
	
	CovidVaccination(int nrOfDaysBetweenVaccination, int numberOfDosesRequired) {
		this.nrOfDaysBetweenVaccination = nrOfDaysBetweenVaccination; 
		this.numberOfDosesRequired = numberOfDosesRequired;
	}
	
	public LocalDate calculateDateOfSecondShot(LocalDate dateOfFirstDose) {
		if (numberOfDosesRequired == 1) 
			throw new NrOfDosesRuntimeException();
		
		return dateOfFirstDose.plusDays(nrOfDaysBetweenVaccination);
	}
		
	public int getNrOfDaysBetweenVaccination() {
		return nrOfDaysBetweenVaccination;
	} 
	
	public int getNumberOfDosesRequired() {
		return numberOfDosesRequired;
	} 
}
