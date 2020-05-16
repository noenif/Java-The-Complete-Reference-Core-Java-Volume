package Chapter_6_Interfaces_Lambda_Expressions_and_Inner_Classes.EmployeeSortTest;

import java.util.*;

/**
 * 6   * This program demonstrates the use of the Comparable interface.
 * 7   * @version 1.30 2004-02-27
 * 8   * @author Cay Horstmann
 * 9
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}