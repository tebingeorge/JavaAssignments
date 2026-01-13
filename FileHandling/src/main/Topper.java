package main;

import java.io.*;
public class Topper {
 public static void main(String[] args) throws Exception {
 BufferedReader br = new BufferedReader(new FileReader("students.csv"));
 String line;
 int max = 0;
 String topper = "";
 br.readLine();
 while((line = br.readLine()) != null) {
 String[] data = line.split(",");
 int marks = Integer.parseInt(data[2]);
 if(marks > max) {
 max = marks;
 topper = data[1];
 }
 }
 br.close();
 System.out.println("Topper: " + topper + " Marks: " + max);
 }
}