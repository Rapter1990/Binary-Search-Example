package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import model.City;

public class ReadFile implements Serializable{
	
	private static ArrayList<City> cities = new ArrayList<City>();

	public static void readFile(String fileLocation) {
		
		fileLocation = "src/files/" + fileLocation;
		String line = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
			
			line = br.readLine();
			
			while (( line = br.readLine()) != null) {
		        String[] cityIdInformation =  line.split("	");
		        String cityId = cityIdInformation[0];
		        
		        String[] cityNameCountryInformation = cityIdInformation[1].split(", ");
		        
		        String cityName = cityNameCountryInformation[0];
		        String cityCountry = cityNameCountryInformation[1];
		        
		        cityId = cityId.trim();
		        cityName = cityName.trim();
		        cityCountry = cityCountry.trim();
		        
		        City city = new City();
		        city.setCityWeight(Integer.parseInt(cityId));
		        city.setCityName(cityName);
		        city.setCountryName(cityCountry);
		        
		        cities.add(city);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(fileLocation + " dosyasý bulunamadý..");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Dosya açýlýrken hata oluþtu");
		} finally {
			System.out.println("Dosya okuma iþlemi tamamlandý");
		}
	}
	
	public static ArrayList<City> getCities() {
		return cities;
	}
}
