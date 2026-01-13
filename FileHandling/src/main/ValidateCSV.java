package main;

import java.io.*;
public class ValidateCSV {
 public static void main(String[] args) throws Exception {
 BufferedReader br = new BufferedReader(new FileReader("students.csv"));
 String line;
 br.readLine();
 while((line = br.readLine()) != null) {
 try {
 Integer.parseInt(line.split(",")[2]);
 System.out.println(line);
 } catch(NumberFormatException e) {
 continue;
 }
 }
 br.close();
 }
}
