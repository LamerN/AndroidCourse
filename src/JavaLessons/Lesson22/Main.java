package JavaLessons.Lesson22;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 10; i++ ){
            nums.add(i);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Женя");
        names.add("Андрей");
        names.add("Виктор");
        names.add("Василий");
        names.add("Александр");
        names.add("Андрей");
        names.add("Михаил");
        names.add("Юрий");
        names.add("Денис");
        names.add("Артем");

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++){
            result.add(nums.get(i) + " - " + names.get(i));
        }
        for (String s:result) {
            System.out.println(s);
        }
    }
}
