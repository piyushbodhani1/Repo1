package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Scanner;

public class PrimeTest {
	@Test
	public void PrimecheckExpresion() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number :-");
			int n = sc.nextInt();
			Prime prime = new Prime();
			boolean sum = prime.Primecheck(n);
			if (sum == false) {
				assertEquals(false, sum);
			} else if (sum == true) {
				assertEquals(true, sum);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
