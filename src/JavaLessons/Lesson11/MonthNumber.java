package JavaLessons.Lesson11;

public class MonthNumber {
    public static void main(String[] args) {
        String[] year = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int num = -1;
        if (num >= 1 && num <= year.length) {
            System.out.println(year[num - 1]);
        } else {
            System.out.println("Месяц не существует");
        }
    }
}
