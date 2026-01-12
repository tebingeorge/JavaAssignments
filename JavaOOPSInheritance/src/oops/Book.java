package oops;
public class Book {
 int bookId;
 String title;
 Book() {
 bookId = 1;
 title = "Java Basics";
 }
 Book(int id, String t) {
 bookId = id;
 title = t;
 }
 void display() {
 System.out.println(bookId + " " + title);
 }
 public static void main(String[] args) {
 Book b1 = new Book();
 Book b2 = new Book(2, "OOPs Java");
 b1.display();
 b2.display();
 }
}