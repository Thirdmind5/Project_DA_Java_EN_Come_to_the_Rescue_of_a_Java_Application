package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class toolkit {
	
	
	
		
		public static void main(String[] args) throws IOException {
			
			
			File symptoms = new File("D:\\symptoms.txt");
			
			BufferedReader br = new BufferedReader (new FileReader(symptoms));
			
			
			String line;
			
			boolean isThere = false;
			
			
			HashMap<String,Integer> counter = new HashMap<String,Integer>();
			
			while ((line = br.readLine()) != null) {
			
				
				counter.put(line, counter.getOrDefault(line,0) + 1);
				
			
				
			}
			
			for(Map.Entry<String,Integer> me : counter.entrySet()){
				
				System.out.println(me.getKey() + " : " + me.getValue());
			
			
			
		}

	}
	}


