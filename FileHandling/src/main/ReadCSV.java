package main;
import java.io.*;

public class ReadCSV {
	 public static void main(String[] args) throws Exception {
	 BufferedReader br = new BufferedReader(new FileReader("students.csv"));
	 String line;
	 while((line = br.readLine()) != null) {
	 System.out.println(line);
	 }
	 br.close();
	 }
	}