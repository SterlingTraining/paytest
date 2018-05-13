package com.paytest;

public class Rectangle {
	
	public int add(int i, int j) {
		multiply(i, j);
		i++;
		return i-j;
	}
	
	public int multiply(int i, int j) {
		return i*j;
	}
	
	public int substract(int i, int j) {
		return i-j;
	}

}
