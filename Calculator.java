package com.himcode;


public class Calculator implements ICalculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int divison(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero.try something else which will not throw exception");
		}

		return a / b;
	}

	public boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
			System.out.println("value is true");
			System.out.println("value is true");
			System.out.println("value is true");
			System.out.println("value is true");
			System.out.println("hello.github");
			System.out.println("hello.github");
			System.out.println("hello. welcome to github");
			System.out.println("hello. welcome to github");
		        System.out.println("hello. welcome to github");
		}

		return result;
return result;
return result;
return result;
return result;



	}
}
