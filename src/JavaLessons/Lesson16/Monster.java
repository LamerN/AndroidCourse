package JavaLessons.Lesson16;

public class Monster {
    int eyeNum;
    int legNum;
    int armNum;

    public Monster(){
        eyeNum = 2;
        legNum = 2;
        armNum = 2;
    }

    public Monster(int eyeNum) {
        this.eyeNum = eyeNum;
        this.legNum = 2;
        this.armNum = 2;
    }

    public Monster(int eyeNum, int armNum) {
        this.eyeNum = eyeNum;
        this.legNum = 2;
        this.armNum = armNum;
    }

    public Monster(int eyeNum, int legNum, int armNum) {
        this.eyeNum = eyeNum;
        this.legNum = legNum;
        this.armNum = armNum;
    }

    void voice(){
        System.out.println("голос");
    }

    void voice(int i){
        for (int n=1; n<=i; n++){
            System.out.print("голос ");
        }
    }

    void voice(int i, String word){
        for (int n = 1; n<=i; n++){
            System.out.print(word+" ");
        }
    }

    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.voice(3, "fgh");
    }
}
