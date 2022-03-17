package JavaLessons.Lesson25.Main;

import JavaLessons.Lesson25.Employee.Cook;
import JavaLessons.Lesson25.Employee.Driver;
import JavaLessons.Lesson25.Employee.Employee;
import JavaLessons.Lesson25.Employee.Interfaces.CanCook;
import JavaLessons.Lesson25.Employee.Interfaces.CanDrive;
import JavaLessons.Lesson25.Employee.Interfaces.CanProgramming;
import JavaLessons.Lesson25.Employee.Programmer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer prog1 = new Programmer("Andy");
        Programmer prog2 = new Programmer("Viktor");
        Programmer prog3 = new Programmer("Aleksandr");
        Driver driv1 = new Driver("Jack");
        Driver driv2 = new Driver("Jim");
        Driver driv3 = new Driver("Stiv");
        Cook cook1 = new Cook("Dmitry");
        Cook cook2 = new Cook("Sergey");
        Cook cook3 = new Cook("Pavel");

        ArrayList<Employee> arrayAll = new ArrayList<>();
        arrayAll.add(prog1);
        arrayAll.add(prog2);
        arrayAll.add(prog3);
        arrayAll.add(driv1);
        arrayAll.add(driv2);
        arrayAll.add(driv3);
        arrayAll.add(cook1);
        arrayAll.add(cook2);
        arrayAll.add(cook3);
        for(Employee employee : arrayAll) {
            employee.voice();
        }

        ArrayList<CanProgramming> proggers = new ArrayList<>();
        proggers.add(prog1);
        proggers.add(prog2);
        proggers.add(prog3);
        for (CanProgramming prog : proggers) {
            prog.programming();
        }

        ArrayList<CanDrive> drivers = new ArrayList<>();
        drivers.add(driv1);
        drivers.add(driv2);
        drivers.add(driv3);
        for (CanDrive driver : drivers) {
            driver.driving();
        }

        ArrayList<CanCook> cookers = new ArrayList<>();
        cookers.add(cook1);
        cookers.add(cook2);
        cookers.add(cook3);
        for (CanCook cooker : cookers){
            cooker.cooking();
        }

    }
}
