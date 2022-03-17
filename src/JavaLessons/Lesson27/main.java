package JavaLessons.Lesson27;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(71);
        try {
            System.out.println(arrayList.get(4));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Выход за пределы списка");
        } finally {
            System.out.println("блок finally");
        }
    }
}
