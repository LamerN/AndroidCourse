package JavaLessons.Lesson17.Box;

public class BoxWeight extends Box{
    private int weight;

    public BoxWeight(){
        super();
    }

    public BoxWeight(int width, int height, int length, int weight) {
        super(width, height, length);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
