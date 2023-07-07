package catalog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map.Entry;

import java_task.Deal;
import utils.FileOperations;
import utils.Parser;
import java.util.*;

public class Catalog {

	private ArrayList<Deal> list = new ArrayList<Deal>(5000);

	public void loadFromFile(String path) {
		ArrayList<String> rows = FileOperations.readFromFile(path);
		for (String row : rows) {
			Deal deal = Parser.parseRow(row);
			list.add(deal);
		}
	}

	public void writeCatalogueToFile(String path) {
		FileOperations.writeToFile(list, path);
	}

	public void addDeal(Deal deal) {
		list.add(deal);
	}

	public void printCatalog() {
		for (Deal deal : list) {
			System.out.println(deal.toString());
		}
	}

	public void sortByQuality() {
		Comparator<Deal> byQualityAndQuantity = (Deal deal1, Deal deal2) -> {
			int qualityComparison = deal1.getQuality().compareTo(deal2.getQuality());
			if (qualityComparison == 0) {
				return Float.compare(deal2.getQuantity(), deal1.getQuantity());
				// deal2.getQuantity().compareTo(deal1.getQuantity());
			} else {
				return qualityComparison;
			}
		};
		list.sort(byQualityAndQuantity);
		for (Deal deal : list) {
			System.out.println(deal.toString());
		}
	}

	public void printList() {
		Map<String, Float> totals = new TreeMap<>();
		for (Deal deal : list) {
			String name = deal.mushroomSort;
			float total = totals.getOrDefault(name, 0f) + deal.getQuantity();
			totals.put(name, total);
		}
		totals.entrySet().stream().sorted(Map.Entry.<String, Float>comparingByValue().reversed())
				.forEachOrdered(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " kg."));
	}

}
