package JavaLessons.Lesson21.Main;

import JavaLessons.Lesson21.Man.Man;

public class Main {
    public static void main(String[] args) {
        String str = "Это Иван, ему 34 года, рост 166.3 см. Должнось - программист.";
        String name = str.substring(4, 8);
        String position = str.substring(49, 60);
        int age = Integer.parseInt(str.substring(14, 16));
        double height = Double.parseDouble(str.substring(28, 33));
        Man man = new Man(name, position, age, height);
        man.showInfo();


    }
}
