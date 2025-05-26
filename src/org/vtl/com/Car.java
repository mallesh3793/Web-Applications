package org.vtl.com;


public class Car extends Engine {
	public  void drive() {
		//start the engine
		Engine eng = new Engine();
		int start = eng.start();
		if(start >= 1) {
			System.out.println("journey started.........");
		}
		//start the journey
	}
}
