package learn;

public class Teacher extends Person implements Teaching {
    //吃东西的功能
    @Override
    public void eat() {
        System.out.println("老师吃东西，请勿打扰");
    }
    //睡觉的功能
    @Override
    public void sleep() {
        System.out.println("老师睡觉，打着呼噜不敢说");
    }
    //老师教书功能
    @Override
    public void teachingWay() {
        System.out.println("老师教出来的学生棒滴");
    }
}

