package JavaLessons.Lesson25.Employee;

import JavaLessons.Lesson25.Employee.Interfaces.CanProgramming;

public class Programmer extends Employee implements CanProgramming {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void programming() {
        System.out.println("программирует");
    }
}
