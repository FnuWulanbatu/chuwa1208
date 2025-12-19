package oop.assignments.employee;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 1, 75000.0);
        Employee e2 = new Employee("Bob", 2);
        Employee e3 = new Employee("Carol");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}



