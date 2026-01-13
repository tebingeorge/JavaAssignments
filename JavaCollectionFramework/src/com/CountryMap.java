package com;

import java.util.HashMap;
import java.util.Map;
public class CountryMap {
 public static void main(String[] args) {
 HashMap<String,String> map = new HashMap<>();
 map.put("IN","India");
 map.put("US","USA");
 map.put("UK","United Kingdom");
 for(Map.Entry<String,String> e : map.entrySet()) {
 System.out.println(e.getKey()+" = "+e.getValue());
 }
 }
}
