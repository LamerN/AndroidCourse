package JavaLessons.Lesson25.Employee;

import JavaLessons.Lesson25.Employee.Interfaces.CanCook;

public class Cook extends Employee implements CanCook {
    public Cook(String name) {
        super(name);
    }

    @Override
    public void cooking(){
        System.out.println("готовит");
    }
}
