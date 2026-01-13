package main;

import java.io.*;
public class SearchStudent {
 public static void main(String[] args) throws Exception {
 BufferedReader br = new BufferedReader(new FileReader("students.csv"));
 String nameToSearch = "Ravi";
 String line;
 br.readLine();
 while((line = br.readLine()) != null) {
 String[] data = line.split(",");
 if(data[1].equalsIgnoreCase(nameToSearch)) {
 System.out.println(line);
 }
 }
 br.close();
 }
}
