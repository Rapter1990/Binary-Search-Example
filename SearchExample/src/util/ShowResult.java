package util;

import java.io.Serializable;
import java.util.ArrayList;

import model.City;

public class ShowResult implements Serializable{

	public static void showCityValues(ArrayList<City> cities) {
		
		for(City city: cities) {
			
			System.out.println("City Weight : " + city.getCityWeight());
			System.out.println("City Name : " + city.getCityName());
			System.out.println("City Country : " + city.getCountryName());
			System.out.println("----------------------------------------");
		}
	}
	
	public static void getValuesFromIndexArray(ArrayList<City> cities, Integer[] indexArray) {
		ArrayList<City> resultCities = new ArrayList<>();
		for (Integer index :indexArray) {
			resultCities.add(cities.get(index));
		}
		
		showSearchCityValues(resultCities);
	}
	
	public static void showSearchCityValues(ArrayList<City> cities) {
		System.out.println("----------------------------------------");
		for(City city: cities) {
			System.out.println("City Weight : " + city.getCityWeight() + 
					           " | City Name : " + city.getCityName() +
					           " | City Country : " + city.getCountryName()
					          );
		}
		System.out.println("----------------------------------------");
		System.out.println("The result of Search Size : " + cities.size());
		WriteFile.writeResultToFile(cities);
	}
	
	
}
