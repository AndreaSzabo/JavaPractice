package com.java;

import java.util.ArrayList;

public class FizzBuzz {
	
	private static final String FIZZ = "FIZZ";	//modulo 3 == 0
	private static final String BUZZ = "BUZZ";	//modulo 5 == 0
	private int bottomInterval;
	private int upInterval;
	private ArrayList<String> solution = new ArrayList<String>();

	public void init(String first, String second) {
		bottomInterval = Integer.parseInt(first);
		upInterval = Integer.parseInt(second);	
		
		if (bottomInterval >= upInterval) 
			System.err.println("The second argument can't be less than the first one (^^,)");
		
	}	
	
	public void play() {
		
		for (int i = bottomInterval; i <= upInterval; i++) {
			
			if ( (i % 15) == 0)
				solution.add(FIZZ + " " + BUZZ);
			else if (i % 3 == 0 )
				solution.add(FIZZ);
			else if (i % 5 == 0)
				solution.add(BUZZ);
		}			
	}	
	
	public String getSolution() {
		return String.join(", ", solution);
	}
}
