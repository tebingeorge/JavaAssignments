package com;

import java.util.ArrayList;
public class CourseListDemo {
 public static void main(String[] args) {
 ArrayList<String> courses = new ArrayList<>();
 courses.add("Java");
 courses.add("Python");
 courses.add("C++");
 courses.add("HTML");
 courses.add("Spring");
 for(String c : courses) {
 System.out.println(c);
 }
 }
}
