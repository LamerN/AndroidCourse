package JavaLessons.Lesson3;

public class Test2 {
    public static void main(String[] args) {
        int summaChisel = 0;
        int kolichChisel = 100;
        //for(int i = 1; i<=kolichChisel; i++){
      //      System.out.println(i);
      //      summaChisel +=i;
      //  }
        int i=1;
        while (i<=kolichChisel){
            summaChisel = summaChisel+i;
            i++;
        }
        float sredneeArifm =  summaChisel/(float)kolichChisel;
        System.out.println("srednee arifmeticheskoe "+kolichChisel+" = "+sredneeArifm);
    }
}
