package org.example;

import java.sql.Date;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeData employeeData = new EmployeeData();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            showMenu();
            int choice = getChoice();

            switch (choice) {
                case 1 -> createEmployee();
                case 2 -> viewEmployeeById();
                case 3 -> viewAllEmployees();
                case 4 -> updateEmployee();
                case 5 -> deleteEmployee();
                case 6 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    // Show menu to the user
    private static void showMenu() {
        System.out.println("\n1. Create Employee");
        System.out.println("2. View Employee by ID");
        System.out.println("3. View All Employees");
        System.out.println("4. Update Employee");
        System.out.println("5. Delete Employee");
        System.out.println("6. Exit");
    }
    // Get choice from the user
    private static int getChoice() {
        System.out.print("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    // Collect employee data from the user
    private static Employee getEmployeeDetails() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter position: ");
        String position = scanner.nextLine();
        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter hire date (YYYY-MM-DD): ");
        Date hireDate = Date.valueOf(scanner.nextLine());
        return new Employee(0, name, position, salary, hireDate);
    }

    // Create new employee
    private static void createEmployee() {
        Employee employee = getEmployeeDetails();
        employeeData.createEmployee(employee);
    }

    // View employee by ID
    private static void viewEmployeeById() {
        System.out.print("Enter employee ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        employeeData.displayEmployeeById(id);
    }

    // View all employees
    private static void viewAllEmployees() {
        employeeData.displayAllEmployees();
    }

    // Update an employee's information
    private static void updateEmployee() {
        System.out.print("Enter employee ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        Employee employee = employeeData.getEmployeeById(id);
        if (employee != null) {
            System.out.println("Updating: " + employee);
            Employee updatedEmployee = getEmployeeDetails();
            updatedEmployee.setID(id);  // Keep the same ID
            employeeData.updateEmployee(updatedEmployee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Delete an employee
    private static void deleteEmployee() {
        System.out.print("Enter employee ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        employeeData.deleteEmployee(id);
    }
}
