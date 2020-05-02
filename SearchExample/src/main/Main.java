package main;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import model.City;
import util.BinarySearch;
import util.ProcessMethod;
import util.ReadFile;
import util.ShowResult;

public class Main {
	
	private static ArrayList<City> cities = new ArrayList<City>();

	public static void main(String[] args) { 
		Instant start = Instant.now();
		ReadFileProcess();
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time Duration: "+ (double) ((timeElapsed.toMillis()/ (double) 1000) / (double) 60) +" seconds");
		
		enterSearchValue();
	}

	private static void ReadFileProcess() {
		ReadFile.readFile("cities.txt");
		
		cities = ReadFile.getCities();
		
		ShowResultsOfFile();
	}

	private static void ShowResultsOfFile() {
		ShowResult.showCityValues(cities);
		System.out.println("Cities Size : " + cities.size());
	}
	
	private static void enterSearchValue() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the word of character which I want to search : ");
		String charWord = scanner.nextLine();
		
		System.out.println("%cities.txt");
		System.out.println("Search " + charWord);
		
		Instant start = Instant.now();
		if(charWord.length() > 3) {
			ProcessMethod.binarySearchProcess(cities, charWord);
			
		}else if(charWord.length() > 1 && charWord.length() <= 3) {
			// ProcessMethod.searchByCharacters(cities, charWord);
			ProcessMethod.searchBySubStringCharacter(cities, charWord);
		} else {
			ProcessMethod.binarySearchByOneCharacter(cities, charWord);
		}
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time Duration: "+ (double) ((timeElapsed.toMillis()/ (double) 1000) / (double) 60) +" seconds");
		
	}
	
}
