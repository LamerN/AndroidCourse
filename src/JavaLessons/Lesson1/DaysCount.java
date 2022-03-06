package JavaLessons.Lesson1;

public class DaysCount {
    public static void main(String[] args) {
        int sec = 1000000;
        int days = sec/(60*60*24);
        int hours = (sec%(60*60*24))/(60*60);
        int min = ((sec%(60*60*24))%(60*60))/60;
        int leftSec = sec-(days*60*60*24)-(hours*60*60)-(min*60);
        System.out.println("Seconds: "+sec);
        System.out.println("Days: "+days);
        System.out.println("Hours: "+hours);
        System.out.println("Minuts: "+min);
        System.out.println("LeftSeconds: "+leftSec);
    }
}
