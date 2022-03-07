package JavaLessons.Lesson13;

public class Dog {
    String petName;
    String breed;
    int speed;

    void run(){
        String word = "\"";
        for(int i=1; i<=speed; i++){
            word += "бегу";
            if(i!=speed){
                word += ", ";
            } else word += ".";
        }
        word +="\"";
        System.out.println(word);
    }

    String info(){
        return "Кличка: "+petName+ "; Порода: "+breed+"; Скорость: "+speed+".";
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.petName = "Chuckie";
        dog.breed = "taksa";
        dog.speed = 4;

        dog.run();
        System.out.println(dog.info());
    }
}
