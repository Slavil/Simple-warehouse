package utils;



import java_task.Deal;

public class Parser {
	public static Deal parseRow(String row) {
		String[] parts = row.split(", ");
		return createDeal(parts);

	}

	private static Deal createDeal(String[] parts) {

		String date = parts[0];
	    int mushroomType = Integer.parseInt(parts[1]);
		float quantity = Float.parseFloat(parts[2]);
		int quality = Integer.parseInt(parts[3]);
		String person = parts[4];

		return new Deal(date, mushroomType, quantity, quality, person);
	}
}
