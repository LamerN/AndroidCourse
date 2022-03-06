package JavaLessons.Lesson10;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
        double array[] = new double[10];
        for (int i = 0; i<array.length;i++){
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        System.out.println("-------------------------------------");

        double max = 0;
        for(double i:array){
            if(max<i){
                max = i;
            }
        }
        System.out.println(max);
        System.out.println("-------------------------------------");

        for (int i = 0;i<array.length;i++){
            array[i] = array[i]/max;
            System.out.println(array[i]);
        }
    }
}
