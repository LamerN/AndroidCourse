package JavaLessons.Lesson23;

public class Rect extends Figure{
    public Rect(int sideA, int sideB) {
        super(sideA, sideB);
    }

    public Rect(int a){
        super(a, a);
    }

    @Override
    double area() {
        return getSideA() * getSideB();
    }
}