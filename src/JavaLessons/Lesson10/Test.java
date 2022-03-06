package JavaLessons.Lesson10;

public class Test {
    public static void main(String[] args) {
        int[] array1 = new int[901];
        for (int i =100; i<=1000; i++){
            array1[i-100] = i;
        }
        int[] array2 = new int[array1.length];
        for(int i = 0; i< array2.length; i++){
            array2[i] = array1[array1.length-i-1];
        }
        for(int i:array2){
            System.out.println(i);
        }

    }
}
