package com.company.HomeWork6;
import java.util.Scanner;
public class AnyNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите любое число:");
		int x = scan.nextInt();
		System.out.println("Введите кол-во повторений вывода вашего числа:");
		int y = scan.nextInt();


		for (int i = 0; i < y; i++) {
			System.out.print(x +" ");
		}
	}

}
