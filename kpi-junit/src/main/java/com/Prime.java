package com;

public class Prime {
	boolean Primecheck(int a) {
		boolean flag = false;

		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				flag = true;
			}
		}
		if (flag == true)
			return false;
		else
			return true;
	}
}
