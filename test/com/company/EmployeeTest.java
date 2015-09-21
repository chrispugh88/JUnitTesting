package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chris on 26/08/15.
 */
public class EmployeeTest {

    public static final String FIRST_NAME = "Test";
    public static final String SURNAME = "Person";
    public static final String POST_CODE = "AB1 1BA";
    public static final String POST_CODE1 = "AB2 2BA";
    public static final int WAGE = 1000000;
    public static final int UNDER_AGE = 17;
    private static final int CORRECT_AGE = 30;
    private static final int LOW_CORRECT_AGE = 18;
    private static final int HIGH_CORRECT_AGE = 65;
    private static final int OVER_AGE = 66;

    public Employee employee1;

    @Before
    public void setUp() throws Exception {
        System.out.println("Setup");
        employee1 = new Employee(FIRST_NAME, SURNAME, POST_CODE, CORRECT_AGE);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Teardown");
    }

//    @Test
//    public void testGetFirstName() throws Exception {
//        Employee employee1 = new Employee("Test", "Person", "AB1 1BA");
//        assert employee1.getFirstName() == "Test";
//    }

    @Test
    public void testEmployeeConstructor() throws Exception {
        assertTrue(employee1.getFirstName().equals(FIRST_NAME));
        assertTrue(employee1.getSurname().equals(SURNAME));
        assertTrue(employee1.getPostCode().equals(POST_CODE));
        assertTrue(employee1.getWage() == 0);
    }

/*
    @Test
    public void testWage() throws Exception {
        employee1.setWage(WAGE);
        assertTrue(employee1.getWage() == WAGE);
    }
*/
    @Test
    public void testGetStaffNo() throws Exception {
        int emp1No = employee1.getStaffNo();
        Employee employee2 = new Employee("A", "B", "C", CORRECT_AGE);
        assertTrue(employee2.getStaffNo() == emp1No + 1);
    }

    @Test
    public void testSetPostCode() throws Exception {
        employee1.setPostCode(POST_CODE1);
        assertTrue(employee1.getPostCode().equals(POST_CODE1));
    }

    @Test
    public void testGetName() throws Exception {
        assertTrue(employee1.getName().equals(SURNAME + ", " + FIRST_NAME + "."));
    }

    @Test
    public void testCorrectAge() throws Exception {
        assertTrue("Correct age doesn't work",true);
    }

    @Test
    public void testUnderAge() throws Exception {
        try {
            employee1 = new Employee(FIRST_NAME, SURNAME, POST_CODE, UNDER_AGE);
            assertTrue("System accepts underage", false);
        } catch (Exception e) {
            assertTrue("System accepts underage", true);
        }
    }

    @Test
    public void testOverAge() throws Exception {
        try {
            employee1 = new Employee(FIRST_NAME, SURNAME, POST_CODE, OVER_AGE);
            assertTrue("System accepts overage", false);
        } catch (Exception e) {
            assertTrue("System accepts overage", true);
        }
    }

    @Test
    public void testAgeBoundaries() throws Exception {
        employee1 = new Employee(FIRST_NAME, SURNAME, POST_CODE, HIGH_CORRECT_AGE);
        assertTrue("High correct age doesn't work", true);
        employee1 = new Employee(FIRST_NAME, SURNAME, POST_CODE, LOW_CORRECT_AGE);
        assertTrue("Low correct age doesn't work", true);
    }

    @Test
    public void testGetYearsToRetirement() throws Exception{
        assertTrue("getYearsToRetirement doesn't work", employee1.getYearsToRetirement() == Employee.getRetirementAge() - employee1.getAge());
    }

/*
    @Test
    public void testSetWage() throws Exception {

    }
    */
}