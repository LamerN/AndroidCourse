package JavaLessons.Lesson17.Box;

public class Box {
    private int width = 0;
    private int height = 0;
    private int length = 0;

    public Box() {
    }

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(Box box1, Box box2){
        this.width = box1.width + box2.width;
        this.height = box1.height + box2.height;
        this.length = box1.length + box2.length;
    }

    public void showInfo(){
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Длина: " + length);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int boxVolume(){
        return length * height * width;
    }

    public Box addition(Box box){
        Box finalBox = new Box();
        finalBox.width = this.width + box.width;
        finalBox.height = this.height + box.height;
        finalBox.length = this.length + box.length;
        return finalBox;
    }


}
