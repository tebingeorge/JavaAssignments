package com;

import java.util.ArrayList;
public class CheckFruit {
 public static void main(String[] args) {
 ArrayList<String> fruits = new ArrayList<>();
 fruits.add("Apple");
 fruits.add("Banana");
 fruits.add("Orange");
 System.out.println(fruits.contains("Apple"));
 }
}