package org.vtl.beans;

public class Car {
private IEngine eng;
public void setEng(IEngine eng) {
	System.out.println("setEng() ::: called");
	this.eng =eng;
}
public void drive() {
	int status =eng.start();
	if(status >=1) {
		System.out.println("Journey stareted....");
	}else {
		System.out.println("Engine Trouble..");
	}
}
}
