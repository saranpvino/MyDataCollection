package week3.day1;

import org.apache.commons.math3.analysis.function.Add;

public class Calculator {
	//Method OverLoading
	public void add(int x,int y) {
		int sum	=	x+y;
		System.out.println("ADD: "+sum);
	}
	public void add(int x,int y,int z) {
		int sum	=	x+y+z;
		System.out.println("ADD: "+sum);
	}
	public void multiply(int x,int y) {
		int mul	=	x*y;
		System.out.println("MULTIPLY: "+mul);
	}
	public void multiply(int x,double y) {
		double mul	=	x*y;
		System.out.println("MULTIPLY: "+mul);
	}
	public void subtract(int x,int y) {
		int sub	=	x-y;
		System.out.println("SUBTRACT: "+sub);
	}
	public void subtract(double x,double y) {
		double sub	=	x-y;
		System.out.println("SUBTRACT: "+sub);
	}
	public void divide(int x,int y) {
		int div	=	x/y;
		System.out.println("DIVIDE: "+div);
	}
	public void divide(int x,double y) {
		double div	=	x/y;
		System.out.println("DIVIDE: "+div);
	}
	public static void main(String[] args) {
		Calculator calc	=	new Calculator();
		calc.add(3, 4);
		calc.add(3, 4, 5);
		calc.multiply(3, 4);
		calc.multiply(3, 4.4);
		calc.subtract(5, 4);
		calc.subtract(5.5, 4.4);
		calc.divide(10, 5);
		calc.divide(10, 0.1);
	}

}
