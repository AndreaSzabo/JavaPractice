package com.java;

import com.java.FizzBuzz.WrongIntervalException;

public class Main {
	
	public static void main(String[] args) {

		if (args.length == 2) {
			FizzBuzz game = new FizzBuzz(); 
			try {
				game.init(args[0], args[1]);
			} catch (WrongIntervalException e) {				
				e.printStackTrace();
			}
			game.play();
			System.out.println(game.getSolution());
		}
		else 
			System.out.println("Not enought arguments");
	}
}
