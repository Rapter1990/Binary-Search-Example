package util;

import java.util.ArrayList;

import model.City;

public class ProcessMethod {

	public static void binarySearchProcess(ArrayList<City> cities, String charWord) {
		System.out.println("binarySearchProcess is working ");
		Integer[] indexArray = BinarySearch.binarySearch(cities, charWord);

		for (int i = 0; i < indexArray.length; i++) {
            System.out.print(indexArray[i] + " ");
        }
		System.out.println();
		ShowResult.getValuesFromIndexArray(cities, indexArray);
	}
	
	public static void searchByCharacters(ArrayList<City> cities, String charWord) {
		System.out.println("binarySearchProcess is working ");
		Integer[] indexArray = BinarySearch.searchByCharacters(cities, charWord);
		
		for (int i = 0; i < indexArray.length; i++) {
            System.out.print(indexArray[i] + " ");
        }
		System.out.println();
		ShowResult.getValuesFromIndexArray(cities, indexArray);
	}
	
	public static void binarySearchByOneCharacter(ArrayList<City> cities, String charWord) {
		System.out.println("binarySearchByOneCharacter is working ");
		Integer[] indexArray = BinarySearch.binarySearchByCharacters(cities, charWord.charAt(0));

		for (int i = 0; i < indexArray.length; i++) {
            System.out.print(indexArray[i] + " ");
        }
		System.out.println();
		ShowResult.getValuesFromIndexArray(cities, indexArray);
	}
	
	public static void searchBySubStringCharacter(ArrayList<City> cities, String charWord) {
		System.out.println("binarySearchProcess is working ");
		Integer[] indexArray = BinarySearch.searchBySubStringCharacter(cities, charWord);
		
		/*for (int i = 0; i < indexArray.length; i++) {
            System.out.print(indexArray[i] + " ");
        }*/
		System.out.println();
		ShowResult.getValuesFromIndexArray(cities, indexArray);
	}
}
