package Chapter_6_Interfaces_Lambda_Expressions_and_Inner_Classes.clone;

/**
 * 4   * This program demonstrates cloning.
 * 5   * @version 1.11 2018-03-16
 * 6   * @author Cay Horstmann
 * 7
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        var original = new Employee("John Q. Public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();
        //只要上面这两条就可以了
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("original=" + original);
        System.out.println("copy=" + copy);
    }
}
