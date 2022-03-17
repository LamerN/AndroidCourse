package JavaLessons.Lesson26;

public class Director {
    String force(Counter counter, int monthCount){
        return counter.getReport(monthCount);
    }
}
