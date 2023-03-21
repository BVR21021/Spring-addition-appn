package com.venky;

public class AdditonBean {
	private int num1;
	private int num2;
	public AdditonBean() {
		super();
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void printAddition() {
		int sum=num1+num2;
		System.out.println(sum);
	}
	

}
