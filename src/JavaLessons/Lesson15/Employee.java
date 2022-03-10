package JavaLessons.Lesson15;

public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String information(int i) {
        return ("Name: " + name + ", Position: " + position + ", Salary: " + salary + ";\n" + "Salary for " + i + " month: " + salary * i);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Grisha", "HR", 1000);
        System.out.println(emp.information(2));
    }
}
