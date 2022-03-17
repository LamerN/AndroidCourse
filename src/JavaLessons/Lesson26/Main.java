package JavaLessons.Lesson26;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Director director = new Director();
        System.out.println(director.force(employee, 5));

        String s = director.force(new Counter() {
            @Override
            public String getReport(int monthCount) {
                return "Отчет за " + monthCount + " месяцев";
            }
        }, 5);
        System.out.println(s);
    }
}
