package main;

import java.io.*;
public class AverageMarks {
 public static void main(String[] args) throws Exception {
 BufferedReader br = new BufferedReader(new FileReader("students.csv"));
 String line;
 int sum = 0, count = 0;
 br.readLine();
 while((line = br.readLine()) != null) {
 sum += Integer.parseInt(line.split(",")[2]);
 count++;
 }
 br.close();
 System.out.println("Average Marks: " + (sum / count));
 }
}
