package com.company;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = null;
        try {
            employee1 = new Employee("Bob", "Bobson", "AB1 2EF", 30);
        } catch (Exception e) {
            e.printStackTrace();
        }
        dumpEmployee(employee1);
        Employee employee2 = null;
        try {
            employee2 = new Employee("Tom", "Tomson", "AC31 2EF", 30);
        } catch (Exception e) {
            e.printStackTrace();
        }
        dumpEmployee(employee2);

    }

    private static void dumpEmployee(Employee employee) {
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getSurname());
        System.out.println("PostCode: " + employee.getPostCode() + " Wage: " + employee.getWage() + " StaffNo: " + employee.getStaffNo());
        System.out.println(employee.toString());
    }

}
