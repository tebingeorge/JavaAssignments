package main;

import java.io.*;
public class PassedStudents {
 public static void main(String[] args) throws Exception {
 BufferedReader br = new BufferedReader(new FileReader("students.csv"));
 FileWriter fw = new FileWriter("passed_students.csv");
 String line;
 fw.write("id,name,marks\n");
 br.readLine();
 while((line = br.readLine()) != null) {
 int marks = Integer.parseInt(line.split(",")[2]);
 if(marks >= 50) {
 fw.write(line + "\n");
 }
 }
 br.close();
 fw.close();
 System.out.println("Passed students copied");
 }
}