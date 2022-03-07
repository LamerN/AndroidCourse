package JavaLessons.Lesson12;

public class People {
    String name;
    int age;
    int weight;

    public static void main(String[] args) {
        People people1 = new People();
        people1.name = "Andrei";
        people1.age = 20;
        people1.weight = 77;
        People people2 = new People();
        people2.name = "Viktor";
        people2.age = 25;
        people2.weight = 88;
        People people3 = new People();
        people3.name = "Sasha";
        people3.age = 17;
        people3.weight = 65;
        People people4 = new People();
        people4.name = "Misha";
        people4.age = 66;
        people4.weight = 104;
        People people5 = new People();
        people5.name = "Zhenya";
        people5.age = 30;
        people5.weight = 77;
        double avarageAge = ( (double)people1.age + people2.age + people3.age + people4.age + people5.age) / 5;
        System.out.println("Средний возраст = " + avarageAge);
    }
}


