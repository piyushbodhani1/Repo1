package com.kpi.collections_excep_junit;

import java.util.Scanner;

public class ExceptionHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int num = a / b;
			System.out.println(" " + num);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Ex found");
		} finally {
			System.out.println("Executed");
		}
	}

}
