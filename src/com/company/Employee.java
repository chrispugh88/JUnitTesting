package com.company;

/**
 * Created by chris on 26/08/15.
 */
public class Employee {
    private String firstName;
    private String surname;
    private String postCode;
    private int age;
    private int wage;
    private int staffNo;
    private static int staffCount = 0;
    private static final int RETIREMENT_AGE = 65;

    public Employee(String firstName, String surname, String postCode, int age) throws Exception {
        this.firstName = firstName;
        this.surname = surname;
        this.postCode = postCode;
        this.wage = 0;
        this.staffNo = ++staffCount;
        if (age < 18){
            throw new Exception("Employee is underage");
        }
        if (age > 65){
            throw new Exception("Employee is over retirement age");
        }
    }

    public static int getRetirementAge() {
        return RETIREMENT_AGE;
    }

    public int getYearsToRetirement() {
        return RETIREMENT_AGE - age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName(){
        return surname + ", " + firstName + ".";
    }

    public String getSurname() {
        return surname;
    }

    public String getPostCode() {
        return postCode;
    }

    public int getWage() {
        return wage;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getAge() {
        return age;
    }
}
