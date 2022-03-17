package JavaLessons.Lesson25.Employee;

import JavaLessons.Lesson25.Employee.Interfaces.CanDrive;

public class Driver extends Employee implements CanDrive {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void driving(){
        System.out.println("водит");
    }
}
