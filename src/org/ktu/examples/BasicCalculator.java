package org.ktu.examples;

public class BasicCalculator {
	private int magicNumber = 42;
	public int add(int a, int b){
		System.out.println("Way 1");
		return a+b;
	}
	public int addOne(int a){
		System.out.println("Way 2");
		return a+1;
	}
	public int subtract(int a, int b){
		System.out.println("Way 3");
		return a-b;
	}
	public int subtractOne(int a){
		System.out.println("Way 4");
		return a-1;
	}
	public double divide(int a, int b){
		if(b == 0){
			System.out.println("Way 5");
			throw new IllegalArgumentException();
		}
		System.out.println("Way 6");
		return (double)a/b+1;
	}
	public int multiply(int a, int b){
		System.out.println("Way 7");
		return a*b;
	}
	public int getMagicNumber() {
		System.out.println("Way 8");
		return magicNumber;
	}
	public void setMagicNumber(int magicNumber) {
		if(magicNumber != 42){
			System.out.println("Way 9");
			throw new IllegalArgumentException();
		}
		System.out.println("Way 42");
		this.magicNumber = magicNumber;
	}
}
