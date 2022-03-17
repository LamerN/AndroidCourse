package JavaLessons.Lesson26;

public class Employee implements Counter{
    @Override
    public String getReport(int monthCount) {
        return "Отчет за " + monthCount + " месяцев";
    }
}
