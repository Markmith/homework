package learn;

public class Student extends Person implements Study {
    //吃的功能
    @Override
    public void eat() {
        System.out.println("学生吃饭，吃不饱");
    }
    //睡的功能
    @Override
    public void sleep() {
        System.out.println("学生睡觉，睡不饱");
    }
    //学生学习功能
    @Override
    public void studyWay() {
        System.out.println("学生自学能力超强");
    }
}
