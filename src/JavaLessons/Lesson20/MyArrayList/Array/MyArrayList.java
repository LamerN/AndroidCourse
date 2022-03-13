package JavaLessons.Lesson20.MyArrayList.Array;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public String get(int n) {
        if (n>=0 && n<size) {
            return array[n];
        } else {
            System.out.println("Такого элемента нет");
            return null;
        }
    }

    public void add(String n) {
        array[size] = n;
        size++;
        if (size == array.length) {
            String arrayBox[] = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                arrayBox[i] = array[i];
            }
            array = arrayBox;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i <= size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else System.out.println("Такого элемента нет");
    }

    public void remove(String str){
        int indexToRemove = -1;
        for (int i = 0; i <= size-1; i++){
            if (array[i].equals(str)){
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove >= 0){
            remove(indexToRemove);
        } else System.out.println("Такого элемента нет");
    }

}
