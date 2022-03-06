package JavaLessons.Lesson10;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        Random random = new Random();
        for(int i=0; i< array1.length; i++){
            array1[i] = random.nextInt(100);
        }
        for(int i:array1){
            System.out.println(i);
        }
        System.out.println("---------------------------------------");
        for (int i = 0; i<array1.length-1;i++){
            if(array1[i]>array1[i+1]){
                System.out.println(array1[i]);
            }
        }
    }
}
