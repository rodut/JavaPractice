package com.javalessons.domainmodel;

public class Employee {
    private static int id;
    private int employeeId;
    private String name;
    private String position;
    private int salary;
    private String project;

    /**  Static initialization block */
    static {
        id = 1000;
        System.out.println("Static initialization block called.");
    }

    /**  Non-static initialization block */
    {
        project = "Random";
        System.out.println("Non-static initialization block called.");
    }


    /**
     * Constructor looks like a method that have a name, parameters and access modifiers.
     * Constructor have no return type. And constructors name must be the same as the class name.
     * Constructor helps us to construct a new object with the parameters that we give to him.
     */
    public Employee() {
        this("A", "B", 1000000);
        System.out.println("Empty constructor called.");
    }

    public Employee(String name, String position, int salary) {
        this(name, position, salary, "Random Project");
        System.out.println("Constructor with three parameters called.");
    }

    private Employee(String name, String position, int salary, String project) {
        employeeId = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.project = project;
        System.out.println("Constructor with four parameters called.");
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}