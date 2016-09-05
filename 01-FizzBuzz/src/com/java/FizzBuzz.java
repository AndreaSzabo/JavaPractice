package com.java;

public class FizzBuzz {
	
	private static final String FIZZ = "FIZZ";	//modulo 3 == 0
	private static final String BUZZ = "BUZZ";	//modulo 5 == 0
	private int bottomInterval;
	private int upInterval;
	private String solution = "";
	

	public void init(String first, String second) throws WrongIntervalException {
		bottomInterval = Integer.parseInt(first);
		upInterval = Integer.parseInt(second);	
		
		if (bottomInterval >= upInterval) 
			throw new WrongIntervalException();	      
		
	}	
	
	public void play() {
		
		for (int i = bottomInterval; i <= upInterval; i++) {
			
			if ( (i % 3) == 0 && (i % 5) == 0)
				solution = solution.concat(FIZZ + " " + BUZZ);
			else if (i % 3 == 0 )
				solution = solution.concat(FIZZ);
			else if (i % 5 == 0)
				solution = solution.concat(BUZZ);
			else
				solution = solution.concat(i + "");
			
			//And the last
			if (i < upInterval)
				solution = solution.concat(", ");			
		}			
	}	
	
	public String getSolution() {
		return solution;
	}

	class WrongIntervalException extends Exception {
		public WrongIntervalException() {
			super("The second argument can't be less than the first one (^^,)");
		}
	}

}
