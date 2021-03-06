package Chapter_6_Interfaces_Lambda_Expressions_and_Inner_Classes.clone;

import java.util.Date;
import java.util.GregorianCalendar;

//一个类实现Cloneable接口以向该Object.clone()方法指示该方法对该类的实例进行逐域复制是合法的。
//在没有实现Cloneable接口的实例上调用Object的clone方法会 导致 CloneNotSupportedException引发异常。
//因为要实现一个类的克隆，他是具体的。
public class Employee implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    //在内部实现clone方法
    public Employee clone() throws CloneNotSupportedException {
        // call Object.clone()
        Employee cloned = (Employee) super.clone();

        // clone mutable fields
        cloned.hireDay = (Date) hireDay.clone();
        //  返回cloned 对象
        //要转换哪个对象，就先强制转换。
        return cloned;
    }

    /**
     * Set the hire day to a given date.
     *
     * @param year  the year of the hire day
     * @param month the month of the hire day
     * @param day   the day of the hire day
     */
    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();

        // example of instance field mutation
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString() {
        return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}