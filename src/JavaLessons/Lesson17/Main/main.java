package JavaLessons.Lesson17.Main;

import JavaLessons.Lesson17.Box.Box;

public class main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 11, 22);
        Box box2 = new Box(32, 11,55);
        Box box3 = new Box(box1, box2);
        System.out.println(box1.boxVolume());
        System.out.println(box2.boxVolume());
        System.out.println(box3.boxVolume());
        System.out.println(box1.addition(box2).boxVolume());


    }
}
