package JavaLessons.Lesson14;

public class Rect {
    int width;
    int height;

    void setRect(int width, int height){
        this.width = width;
        this.height = height;
    }

    int perimetr(){
        return width*2+height*2;
    }

    int square(){
        return width*height;
    }

    public static void main(String[] args) {
        Rect rect1 = new Rect();
        rect1.setRect(10, 8);
        System.out.println("Периметр = "+rect1.perimetr());
        System.out.println("Площадь = "+rect1.square());
    }

}
