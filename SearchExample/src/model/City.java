package model;

import java.io.Serializable;

public class City implements Serializable, Comparable<City>{

	private Integer cityWeight;
	private String cityName;
	private String countryName;
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(int cityWeight, String cityName, String countryName) {
		super();
		this.cityWeight = cityWeight;
		this.cityName = cityName;
		this.countryName = countryName;
	}
	
	public City(String cityName) {
		super();
		this.cityName = cityName;
	}

	public Integer getCityWeight() {
		return cityWeight;
	}

	public void setCityWeight(Integer cityWeight) {
		this.cityWeight = cityWeight;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cityWeight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (cityWeight != other.cityWeight)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "City [cityWeight=" + cityWeight + ", cityName=" + cityName + ", countryName=" + countryName + "]";
	}

	@Override
	public int compareTo(City o) {
		// TODO Auto-generated method stub
		 City city = (City) o;
		 int compareage=city.getCityWeight();
		 if(compareage < 1) {
			 return getCityWeight()-compareage;
		 }else {
			 return compareage-getCityWeight();
		 }
		 
	}
	
}
