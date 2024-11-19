package main.java.org.example.tp.i;

public class Demo {
    public static void main(String[] args) {
        Workable employee = new Employee();
        employee.work();

        if (employee instanceof Eatable) {
            ((Eatable) employee).eat();
        }

        if (employee instanceof Sleepable) {
            ((Sleepable) employee).sleep();
        }

        Workable robot = new Robot();
        robot.work();
    }
}
