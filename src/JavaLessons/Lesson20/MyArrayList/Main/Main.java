package JavaLessons.Lesson20.MyArrayList.Main;

import JavaLessons.Lesson20.MyArrayList.Array.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("Женя");
        arrayList.add("Игорь");
        arrayList.add("Андрей");
        arrayList.add("Виктор");
        arrayList.add("Гриша");
        arrayList.add("Борис");
        for (int i = 0; i < arrayList.getSize(); i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("----------------------------------");
        arrayList.remove("Борис");
        for (int i = 0; i < arrayList.getSize(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
