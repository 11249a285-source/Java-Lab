PROGRAM 3.1 — ShapeDemo.java

interface Shape {
     double area();
 }
 class Circle implements Shape {
     double r;
     Circle(double r) { this.r = r; }
     public double area() { return 3.14159 * r * r; }
 }

 class Rect implements Shape {
     double l, b;
     Rect(double l, double b) { this.l = l; this.b = b; }
     public double area() { return l * b; }
 }
 public class ShapeDemo {
     public static void main(String[] args) {
         Shape[] s = { new Circle(5), new Rect(4, 6) };
         for (Shape x : s)
             System.out.printf("%-8s area = %.2f%n",
                               x.getClass().getSimpleName(), x.area());
     }
 }

PROGRAM 3.2 — SortDemo.java

import java.util.Arrays;

 class Player implements Comparable<Player> {
     String name;
     int runs;
     Player(String n, int r) { name = n; runs = r; }
     public int compareTo(Player p) { return p.runs - runs; }   // high to low
     public String toString() { return name + "(" + runs + ")"; }
 }
 public class SortDemo {
     public static void main(String[] args) {
         Player[] p = { new Player("Ravi", 45), new Player("Anu", 92),
                         new Player("Kiran", 67) };
         Arrays.sort(p);
         System.out.println(Arrays.toString(p));
     }
 }

  
