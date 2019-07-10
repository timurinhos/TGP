package com.company.HomeWork6;

public class WhileForExample1 {

	public static void main(String[] args) {
		//Вывести числа на экран от 1 до 20 используя цикл while
		final int maxValue = 20;
		int count = 0;
		while (count < maxValue) {
			System.out.print(++count + " ");
		}
		System.out.println();
		count = 0;
		
		//Вывести числа на экран от 1 до 20 используя цикл do-while
		do {
			System.out.print(++count + " ");
		} while (count < maxValue);
		System.out.println();
		
		//Вывести числа на экран от 1 до 20 используя цикл for
		for (int i = 0; i < maxValue; i++) {
			System.out.print(i+1 + " ");
		}
		System.out.println();
		
		//Вывести числа на экран от 1 до 20 используя цикл for
		for (int i = 1; i <= maxValue; i++) {
			System.out.print(i + " ");
		}
	}

}
