package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestingClass {
	
	/**
	 * 
	 * This is a test class for testing two methods of AnalyticsCounter
	 */
	
	public static void main(String[] args) {
		System.out.println("This class is to test functions in AnalyticsCounter Class");
		
		AnalyticsCounter testAC = new AnalyticsCounter();
		
		
		System.out.println("Now testimg  AlphabetizeList method ");
		
		List<String> myList = new ArrayList<String>();
		
		myList = testAC.alphabetizeList(getList());
	 	
	 	for(String e: myList) {
	 		System.out.println(e);
	 	}
	 	
	 	System.out.println("If you see the list is sorted in alphabetical order the test has succeded");
	 	
	 	System.out.println("=============================================");
	 	
	 	System.out.println("Now testing the OccurrencesList Method");
	 	
	 	
	 	HashMap<String,Integer> myMap = new HashMap<String,Integer>();
	 	
	 	myMap = testAC.occurrencesList(getList());
	 	
	 	for(HashMap.Entry<String,Integer> e : myMap.entrySet()) {
	 		System.out.println(e.getKey() + " : " + e.getValue());
	 	}
		
	 	System.out.println("If you see 2 X Headache, 2 X Fever and 1 X Bleeding the test passes");
	}
	
	
	static List<String>  getList(){
		
		List<String> testList = new ArrayList<String>();
		
		testList.add("Fever");
		testList.add("Fever");
		testList.add("Headache");
		testList.add("Headache");
		testList.add("Bleeding");
		
		
		return testList;
	}

}
