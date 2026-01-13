package com;

import java.util.ArrayList;
public class ToArrayDemo {
 public static void main(String[] args) {
 ArrayList<String> list = new ArrayList<>();
 list.add("Java");
 list.add("Python");
 Object[] arr = list.toArray();
 for(Object o : arr) {
 System.out.println(o);
 }
 }
}