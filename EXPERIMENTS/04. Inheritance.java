PROGRAM 4.1 — InheritDemo.java
  
 class Person {
     String name;
     Person(String n) { name = n; }
     void show() { System.out.println("Name   : " + name); }
 }
 class Employee extends Person {
     double salary;
     Employee(String n, double s) { super(n); salary = s; }

     void show() { super.show(); System.out.println("Salary : " + salary); }
 }
 class Manager extends Employee {
     String dept;
     Manager(String n, double s, String d) { super(n, s); dept = d; }
     void show() { super.show(); System.out.println("Dept   : " + dept); }
 }
 public class InheritDemo {
     public static void main(String[] args) {
         Person p = new Manager("Meena", 75000, "CSE");
         p.show();
     }
 }

PROGRAM 4.2 — Hierarchical inheritance
  
class Staff {
     String name;
     Staff(String n) { name = n; }
     String role() { return "Staff"; }
 }
 class Teacher extends Staff {
     Teacher(String n) { super(n); }
     String role() { return "Teacher"; }
 }
 class Driver extends Staff {
     Driver(String n) { super(n); }
     String role() { return "Driver"; }
 }
 public class RoleDemo {
     public static void main(String[] args) {
         Staff[] all = { new Teacher("Kumar"), new Driver("Selvam"), new Staff("Raj") };
         for (Staff s : all)
             System.out.println(s.name + " -> " + s.role());
     }
 }
