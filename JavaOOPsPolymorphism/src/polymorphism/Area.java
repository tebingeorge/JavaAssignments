package polymorphism;
public class Area {
 int area(int side) {
 return side * side;
 }
 int area(int length, int breadth) {
 return length * breadth;
 }
 double area(double radius) {
 return 3.14 * radius * radius;
 }
 public static void main(String[] args) {
 Area a = new Area();
 System.out.println(a.area(5));
 System.out.println(a.area(4, 6));
 System.out.println(a.area(3.0));
 }
}