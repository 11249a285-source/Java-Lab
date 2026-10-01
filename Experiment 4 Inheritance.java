Program:

class Person {
    String name;

    Person(String n) {
        name = n;
    }

    void show() {
        System.out.println("Name   : " + name);
    }
}

class Employee extends Person {
    double salary;

    Employee(String n, double s) {
        super(n);
        salary = s;
    }

    void show() {
        super.show();
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    String dept;

    Manager(String n, double s, String d) {
        super(n, s);
        dept = d;
    }

    void show() {
        super.show();
        System.out.println("Dept   : " + dept);
    }
}

class Driver extends Employee {

    Driver(String n, double s) {
        super(n, s);
    }

    void show() {
        super.show();
        System.out.println("Overtime : 3000");
        System.out.println("Total   : " + (salary + 3000));
    }
}

public class InheritDemo {
    public static void main(String[] args) {
        Person p = new Driver("Ravi", 30000);
        p.show();
    }
}

Output:

Name   : Ravi
Salary : 30000.0
Overtime : 3000
Total   : 33000.0
