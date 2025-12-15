package oop.assignments.employee;

public class Employee {
    private final String name;
    private final int id;
    private final double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee(String name, int id) {
        this(name, id, 0.0);
    }

    public Employee(String name) {
        this(name, 0, 0.0);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }
}


