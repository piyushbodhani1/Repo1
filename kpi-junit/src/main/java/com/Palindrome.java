package com;

public class Palindrome {
	boolean Palindromecheck(int number) {

		int remainder, temp;
		int sum =0;
		temp = number;
		while (number > 0) {
			remainder = number % 10;
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		if (temp == number)
			return true;
		else
			return false;

	}
}
