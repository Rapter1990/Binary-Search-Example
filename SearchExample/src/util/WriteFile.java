package util;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

import model.City;

public class WriteFile implements Serializable{

	public static void writeResultToFile(ArrayList<City> cities){
		
		String fileName = "output.txt";
		String fileNameLocation = "src/files/" + fileName;
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileNameLocation)))){
			out.println("Output");
			out.println("----------------------------------------");
			for(City city: cities) {
				out.println("City Weight : " + city.getCityWeight() + 
						           " | City Name : " + city.getCityName() +
						           " | City Country : " + city.getCountryName()
						          );
			}
			out.println("----------------------------------------");
			out.println("The result of Search Size : " + cities.size());		
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Dosya Bulunamadý..");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Dosya I/O iþleminde hata oluþtu.");
		}
		
		
	}
}
