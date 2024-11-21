package org.example;
import java.sql.Date;

public class Employee {
    private int ID;
    private String name;
    private String position;
    private double salary;
    private Date hireDate;

    public Employee(int ID, String name, String position, double salary, Date hireDate) {
        this.ID = ID;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    @Override
    public String toString() {
        return "employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}

