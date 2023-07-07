package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import java_task.Deal;
import java.math.BigDecimal;
public class Questions {
	@SuppressWarnings("unused")
	public static Deal consoleToDeal() {

		Scanner scan = new Scanner(System.in);
		String pattern = "\\d{12}";
		String date = "";
		String invalidInput = "";
		while (true) {
			System.out.println("Date and time (in format YYYYMMDDHHMM): ");
			date = scan.next();

			if (date.matches(pattern)) {
				break; // Exit the loop
			} else {
				System.out.println("Invalid input. Please enter a date and time in the format YYYYMMDDHHMM.");
			}
		}

		int mushroomType = 0;
		while (true) {
			System.out.println(
					"Type of mushroom:(1 for Manatarka, 2 for Pechurka, 3 for Kladnica, 4 for Pachi krak, 5 for Sarnela or 6 for Other type of Mushroom): ");
			try {
				mushroomType = scan.nextInt();
				if (mushroomType >= 1 && mushroomType <= 6) {
					break;
				} else {
					System.out.println("Invalid input. Please enter a number between 1 and 6.");
					mushroomType = scan.nextInt();
				}
				break; // Exit the loop
			} catch (InputMismatchException e) {
				invalidInput = scan.next(); // Read and discard the invalid input
				System.out.println("Invalid input. Please enter a valid number.");
			}
		}

		float quantity = 0;
		while (true) {
			System.out.println("Quantity (in grams): ");
			try {
				quantity = scan.nextFloat();
		        BigDecimal decimalQuantity = new BigDecimal(quantity);
		        decimalQuantity = decimalQuantity.setScale(3, BigDecimal.ROUND_HALF_UP);
		        quantity = decimalQuantity.floatValue();
				break; // 
			} catch (InputMismatchException e) {
				invalidInput = scan.next(); // Read and discard the invalid input
				System.out.println("Invalid input. Please enter a valid number.");
			}
		}

		int quality = 0;
		while (true) {
			try {
				System.out.println("Quality (1 for good, 2 for middle, 3 for bad): ");
				quality = scan.nextInt();
				if (quality >= 1 && quality <= 3) {
					break;
				} else {
					System.out.println("Invalid input. Please enter a number between 1 and 3.");
					quality = scan.nextInt();
				}
				break; // Exit the loop
			} catch (InputMismatchException e) {
				invalidInput = scan.next(); // Read and discard the invalid input
				System.out.println("Invalid input. Please enter a valid number.");
			}
		}

		System.out.println("Mushroom Man Name(up to 50 symbols): ");
		String person = scan.next();

		
		return new Deal(date, mushroomType, quantity, quality, person);

	}

}
