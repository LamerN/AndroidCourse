package JavaLessons.Lesson25.Employee;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice(){
        System.out.println("Имя работника: " + name);
    }
}