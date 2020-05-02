package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import model.City;

public class BinarySearch {

	public static Integer[] binarySearch(List<City> cities, Comparable key) {
	    List<Integer> arrList = new ArrayList<Integer>();
	    int lo = 0, hi = cities.size() - 1, mid;
	    cities.sort((str1, str2) -> str1.getCityName().compareTo(str2.getCityName()));

	    while (lo <= hi) {
	        mid = lo + (hi - lo) / 2;
	        int cmp = key.compareTo(cities.get(mid).getCityName());
	        if (cmp == 0) {
	            int lowerBoundary = lowerIndex(cities, key, lo, mid);
	            int upperBoundary = upperIndex(cities, key, mid, hi);
	            for(int i = lowerBoundary; i <= upperBoundary; i++) {
	                arrList.add(i);
	            }
	            break;
	        } else if (cmp < 0)
	            hi = mid - 1;
	        else
	            lo = mid + 1;
	    }
	    return arrList.stream().toArray(Integer[]::new);
	}

	public static int lowerIndex(List<City> cities, Comparable key, int lo, int hi) {
	    int mid;
	    int lastMatch = hi;
	    while (lo <= hi) {
	        mid = lo + (hi - lo) / 2;
	        int cmp = key.compareTo(cities.get(mid).getCityName());
	        if (cmp == 0) {
	            lastMatch = mid;
	            hi = mid - 1;
	        } else if (cmp < 0) {
	            lo = mid + 1;
	        } else {
	            break;
	        }
	    }

	    return lastMatch;
	}

	public static int upperIndex(List<City> cities, Comparable key, int lo, int hi) {
	    int mid;
	    int lastMatch = lo;
	    while (lo <= hi) {
	        mid = lo + (hi - lo) / 2;
	        int cmp = key.compareTo(cities.get(mid).getCityName());
	        if (cmp == 0) {
	            lastMatch = mid;
	            lo = mid + 1;
	        } else if (cmp < 0) {
	            hi = mid - 1;
	        } else {
	            break;
	        }
	    }

	    return lastMatch;
	}
	
	/*public static Integer[] binarySearch(List<City> cities, String key) {
		List<Integer> result = new ArrayList<>();

		  Comparator<City> comparator = (node1, node2) -> {
		     boolean node1Contains = node1.getCityName().equals(key);
		     boolean node2Contains = node2.getCityName().equals(key);
		     if (node1Contains && !node2Contains) {
		        return 1;
		     } else if (!node1Contains && node2Contains ) {
		        return -1;
		     } else {
		        return Integer.compare(node2.getCityWeight(), node1.getCityWeight());
		     }
		  };
		  Collections.sort(cities, comparator);

		  return IntStream.rangeClosed(0, cities.size() - 1)
		          .filter(i -> cities.get(i).getCityName().equals(key))
		          .boxed()
		          .toArray(Integer[]::new);
    }*/

	public static Integer[] searchByCharacters(List<City> list, String sub) {
		List<Integer> result = new ArrayList<>();
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCityName().contains(sub))
				result.add(i);
		}
		return result.stream().toArray(Integer[]::new);
	}

	public static Integer[] binarySearchByCharacters(List<City> list, char key) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			char[] chars = list.get(i).getCityName().toCharArray();
			Arrays.sort(chars);
			int index = Arrays.binarySearch(chars, key);
			if (index >= 0)
				result.add(i);
		}
		return result.stream().toArray(Integer[]::new);
	}
	
	
	public static Integer[] searchBySubStringCharacter(List<City> list, String sub) {
		  List<Integer> result = new ArrayList<>();

		  Comparator<City> comparator = (node1, node2) -> {
		     boolean node1Contains = node1.getCityName().contains(sub);
		     boolean node2Contains = node2.getCityName().contains(sub);
		     if (node1Contains && !node2Contains) {
		        return 1;
		     } else if (!node1Contains && node2Contains ) {
		        return -1;
		     } else {
		        return Integer.compare(node2.getCityWeight(), node1.getCityWeight());
		     }
		  };
		  Collections.sort(list, comparator);

		  return IntStream.rangeClosed(0, list.size() - 1)
		          .filter(i -> list.get(i).getCityName().contains(sub))
		          .boxed()
		          .toArray(Integer[]::new);
		}
	
}
