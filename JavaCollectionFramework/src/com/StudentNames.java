package com;

import java.util.ArrayList;
public class StudentNames {
 public static void main(String[] args) {
 ArrayList<String> students = new ArrayList<>();
 students.add("Ravi");
 students.add("Anita");
 students.add("Sunil");
 students.add("Priya");
 students.add("Aman");
 for(int i=0;i<students.size();i++) {
 System.out.println(students.get(i));
 }
 }
}
