package com.java;

public class Main {
	
	public static void main(String[] args) {

		if (args.length == 2) {
			FizzBuzz game = new FizzBuzz(); 
			
			game.init(args[0], args[1]);
			
			game.play();
			System.out.println(game.getSolution());
		}
		else 
			System.out.println("Not enough arguments");
	}
}
