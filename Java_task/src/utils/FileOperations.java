package utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

import java_task.Deal;
public class FileOperations {
	public static ArrayList<String> readFromFile(String path){
		
		ArrayList<String> rows = new ArrayList<String>();
		
		try(BufferedReader br = Files.newBufferedReader(Paths.get(path))){
			
			rows = (ArrayList<String>) br.lines().collect(Collectors.toList());

			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return rows;
	}
	public static void writeToFile(ArrayList<Deal> list, String path) {
		try(BufferedWriter bw = Files.newBufferedWriter(Paths.get(path))){
			bw.write("Line Added on: " + new java.util.Date()+"\n");
			for(Deal deal : list) {
				bw.write(deal.toString());
				bw.newLine();
			}
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
