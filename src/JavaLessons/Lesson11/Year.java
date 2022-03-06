package JavaLessons.Lesson11;

public class Year {
    public static void main(String[] args) {
        String[] year = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        for(int i = 0; i< year.length;i++){
            if(i!= year.length-1) {
                System.out.print("\"" + year[i] + "\", ");
            } else {System.out.print("\"" + year[i] + "\".");}
        }
    }
}
