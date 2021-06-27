/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fact;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Fact {
    private static int facRecursive(int number) {
		// base condition
		if (number == 0)
			return 1;

		// calculate the factorial of all number
		return number * facRecursive(number - 1);
	}

	private static int facIterative(int number) {

		int facNumber = 1;
		for (int iNumber = 1; iNumber < number; iNumber++) {
			facNumber = facNumber * (iNumber + 1);
		}
		return facNumber;
	}

	public static void main(String[] args) {		
            try (Scanner scanner = new Scanner(System.in)) {

			/* Calculate factorial for input number */
			System.out.printf(" Enter input number : ");
			int number = scanner.nextInt();

			int facNumber = facRecursive(number);
			System.out.printf("factorial(%d) - Recursive method: %d\n",number,facNumber);

			facNumber = facIterative(number);
			System.out.printf("factorial(%d) - Iterative method: %d\n",number,facNumber);
		}
	}
    
}

