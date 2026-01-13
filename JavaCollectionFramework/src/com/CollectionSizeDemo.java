package com;

import java.util.ArrayList;
public class CollectionSizeDemo {
 public static void main(String[] args) {
 ArrayList<String> cities = new ArrayList<>();
 cities.add("Delhi");
 cities.add("Mumbai");
 cities.add("Chennai");
 cities.add("Kolkata");
 System.out.println("Total cities: " + cities.size());
 }
}