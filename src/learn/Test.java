package learn;

public class Test {

    public static void main(String[] args) {
		Student mStudent = new Student();
		Teacher mTeacher = new Teacher();
		mStudent.eat();
		mStudent.sleep();
		mStudent.studyWay();

		mTeacher.eat();
		mTeacher.sleep();
		mTeacher.teachingWay();

		Person mPerson = new Student();
		mPerson.eat();
		mPerson.sleep();

        wya(new Teacher());
        wya(new Student());
    }

    static void wya(Person wya){
        wya.eat();
        wya.sleep();

        if (wya instanceof Student) {

            Student st = (Student)wya;
            st.studyWay();
        }else if (wya instanceof Teacher) {
            Teacher te = (Teacher)wya;
            te.teachingWay();
        }
    }
}
