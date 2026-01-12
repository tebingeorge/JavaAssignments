package oops;
public class Person {
 String name;
 int age;
 Person(String name) {
 this(name, 18);
 }
 Person(String name, int age) {
 this.name = name;
 this.age = age;
 }
 public static void main(String[] args) {
 Person p = new Person("Rahul");
 System.out.println(p.name + " " + p.age);
 }
}
