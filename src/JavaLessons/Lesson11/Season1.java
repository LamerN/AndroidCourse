package JavaLessons.Lesson11;

public class Season1 {
    public static void main(String[] args) {
        String month = "апрель";
        if(month.equals("декабрь")||month.equals("январь")||month.equals("февраль")){
            System.out.println("Зима");
        } else if(month.equals("март")||month.equals("апрель")||month.equals("март")){
            System.out.println("Весна");
        } else if (month.equals("июнь")||month.equals("июль")||month.equals("август")){
            System.out.println("Лето");
        } else if (month.equals("сентябрь")||month.equals("октябрь")||month.equals("ноябрь")){
            System.out.println("Осень");
        } else System.out.println("месяц не существует");
    }
}
