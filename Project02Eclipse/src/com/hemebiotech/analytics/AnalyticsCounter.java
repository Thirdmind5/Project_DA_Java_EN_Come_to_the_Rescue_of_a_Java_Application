package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


/**
 * AnalyticsCounter class is the main class of this program. In the main method an instance of the class is created.
 * This class uses another class ReadSymptomDataFromFile. This is to read data from a file.
 */


public class AnalyticsCounter {

	
	String path = "D:\\symptoms.txt";
	private	HashMap<String,Integer> symptomsCounter = new HashMap<String,Integer>();
	
	public AnalyticsCounter() {
		System.out.println("In the constructor");
	}
	public static void main(String args[])  {
		
		AnalyticsCounter counter = new AnalyticsCounter();
	
		
		counter.saveToFile(counter.occurrencesList(counter.alphabetizeList(counter.getSymptoms())));
		
		
				
		}//closing for the main method
		
			
/**
 * getSymptoms Method
 * This method creates an instance of the "ReadSymptomDataFromFile" class
 * and returns a list of the symptoms. 
 * 
 */
	List<String> getSymptoms(){
		
		
		ReadSymptomDataFromFile symptomReader = new ReadSymptomDataFromFile(path);
		
		return symptomReader.GetSymptoms();
	}
	
	/**
	 * alphabetizeList method
	 * This method takes in a list of symptoms and returns the list in alphabetical order
	 * 
	 */
	
	List<String> alphabetizeList(List<String> symptomsList){
		
		Collections.sort(symptomsList);
		
		return symptomsList;
	}//end of alphabeteizeList

	
	/**
	 * occurrencesList Method
	 * This method takes the list of occurrences and generates a list of symptoms and number of 
	 * occurences
	 */
	HashMap<String,Integer> occurrencesList(List<String> symptomsList) {
		
		
		
		for(String s: symptomsList) {
			
			symptomsCounter.put(s, symptomsCounter.getOrDefault(s, 0) + 1);
		}
		
		return symptomsCounter;
		
	}//end of occurrencesList
	
	/**
	 * saveToFile Method
	 * This method saves the information to a file. 
	 * This method consumes a HashMap and creates a file.
	 */
	
	void saveToFile(HashMap<String,Integer> Map) {
		
		
		try {
	         BufferedWriter out = new BufferedWriter(new FileWriter("D:\\outfilename"));
	         
	         for( HashMap.Entry<String,Integer> me : symptomsCounter.entrySet()){
	 			
	 			out.append(me.getKey() + " : " + me.getValue());
	 			out.newLine();
	 		 		
	 		   }
	         	         
	         out.close();
	         System.out.println("File created successfully");
	      }
	      catch (IOException e) {
	    	  System.out.println(e.toString());
	      }
	}// End of saveToFile method
	
}// End of Class 