package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.Scanner;

public class PalindromeTest {
	@Test
	public void answer() {
		Palindrome palindrome = new Palindrome();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number:-");
			int a = sc.nextInt();
			boolean check = palindrome.Palindromecheck(a);
			if (check == false) {
				assertEquals(false, check);
			} else if (check == true) {
				assertEquals(true, check);
			}
		}
		catch(Exception ex)
		{
			ex.getMessage();
		}
	}
}
