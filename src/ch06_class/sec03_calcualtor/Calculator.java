package ch06_class.sec03_calcualtor;

public class Calculator {
	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public double div(int x, int y) {
		return (double) x / y;
	}

	// Overloading
	public double add(double x, double y) {
		return x + y;
	}

	public double sub(double x, double y) {
		return x - y;
	}

	public double mul(double x, double y) {
		return x * y;
	}

	public double div(double x, double y) {
		return (double) x / y;
	}

	public void print(int x, int y) {
		System.out.println(x + " + " + y + " = " + add(x, y));
		System.out.println(x + " - " + y + " = " + sub(x, y));
		System.out.println(x + " * " + y + " = " + mul(x, y));
		System.out.println(x + " / " + y + " = " + div(x, y));
	}
}
