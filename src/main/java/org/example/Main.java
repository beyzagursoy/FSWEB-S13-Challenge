package org.example;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    public static void runApp(){
        Healthplan healthplan = new Healthplan(1, "Employee Plan", Plan.BASIC);
        System.out.println((healthplan.toString()));

        String[] plans = new String[3];
        Employee employee = new Employee(1, "Beyza Gursoy", "beyza@mail.com", "12345", plans);

        employee.addHealthPlan(0, "Basic Plan");
        employee.addHealthPlan(0, "Premium Plan");
        employee.addHealthPlan(5, "Gold Plan");

        System.out.println(employee.toString());

        String[] devs = new String[3];
        Company company = new Company(1, "Tech Corp", -5000, devs);

        company.addEmployee(0, "Ali");
        company.addEmployee(0, "Veli");
        company.addEmployee(4, "Ayse");

        System.out.println(company.toString());

    }
}