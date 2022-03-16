package JavaLessons.Lesson23;

public class Triangle extends Figure{
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }

    public Triangle(int a){
        super(a, a);
        this.sideC = a;
    }

    public int getSideC() {
        return sideC;
    }

    @Override
    double area() {
        double p = (getSideA() + getSideB() + getSideC()) / 2;
        double s = Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
        return s;
    }
}
