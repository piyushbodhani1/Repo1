package com.kpi.collections_excep_junit;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in);
				Scanner sc1 = new Scanner(System.in);
				Scanner sc3 = new Scanner(System.in)) {
//			System.out.println("Enter the 1 no:-");
//			int a = sc1.nextInt();
//			System.out.println("Enter the second no:-");
//			int b = sc.nextInt();
//			System.out.println("Enter the second no:-");
//			int c = sc3.nextInt();
			int add = sc.nextInt() + sc.nextInt() + sc.nextInt();
			System.out.println("Addition is:-" + add);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("  ");
		}

	}

}
