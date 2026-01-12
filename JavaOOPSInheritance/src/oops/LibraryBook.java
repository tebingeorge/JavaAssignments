package oops;
public class LibraryBook {
 int bookId;
 String title, author;
 LibraryBook(int id, String t, String a) {
 bookId = id;
 title = t;
 author = a;
 }
 boolean isAvailable() {
 return true;
 }
 public static void main(String[] args) {
 LibraryBook b = new LibraryBook(1, "Java", "James");
 System.out.println(b.isAvailable());
 }
}