package net.lacisoft.covidvaccination;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
	static int lineLenght = 91;
	static String lineChar = "=";

	public static void main(String[] args) {
	
//		System.out.println(CovidVaccination.JOHNSON.calculateDateOfSecondShot(LocalDate.parse("2021.05.10", formatter)));
		

		
		// Kerdes!
		//
		// itt a try / catch et hogyan kell hasznalni best practice modon?
		// mindegyik sorra fel kell huzni kulon?
		// ha az egesz printResult ot befogom egy try / catch be akkor ahol elakad tovabb nem fojtatodik a kod!
		
		System.out.println(headerStr());

		printResult(CovidVaccination.PFIZER, "2022.04.23");
		printResult(CovidVaccination.CONVIDECIA, "2022.04.23");
		printResult(CovidVaccination.MODERNA, "2022.04.23");
		printResult(CovidVaccination.OXFORD, "2022.04.23");
		printResult(CovidVaccination.SINOPHARM, "2022.04.23");
		printResult(CovidVaccination.SZPUTNYIK, "2022.04.23");
		try {
			printResult(CovidVaccination.JOHNSON, "2022.04.23");
		} catch (Exception e) {
			System.out.println("A dozisok szama 1 kivetel!!");
		}

		System.out.println(footerStr());
	}
	
	private static void printResult(CovidVaccination cv, String date) {
		System.out.println(String.format("%-10s  %-15s %3d %25d %30s ",
				date,
				cv.toString(),
				cv.getNrOfDaysBetweenVaccination(), 
				cv.getNumberOfDosesRequired(), 
				cv.calculateDateOfSecondShot(LocalDate.parse(date, formatter)).format(formatter)));
//				cv.calculateDateOfSecondShot(LocalDate.parse(date, formatter))));
	}
	
	public static String headerStr() {
		return lineSeparatorStr() + "\n" +
				"Date       " +
				" Type            " +
				" NrOfDaysBetweenVaccination" +
				" NumberOfDosesRequired" +
				" SecondDoseDay\n" +
				lineSeparatorStr();
	}
	
	public static String footerStr() {
		return lineSeparatorStr() + "\n";
	}
	
	private static String lineSeparatorStr() {
		return lineChar.repeat(lineLenght);
	} 

}
