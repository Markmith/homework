package student;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception{
        boolean flag = true;
        while(flag){

            System.out.println("您想要执行以下哪个操作:");
            System.out.println("1、添加学生   2、更新学生数据   3、删除学生   0、退出");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            if(num==1){
                //添加学生
                AddStudent addStudent = new AddStudent();
                addStudent.add();
            }
            else if(num==2){
                //更新学生数据
                UpdateStudent updateStudent = new UpdateStudent();
                updateStudent.update();
            }
            else if(num==3){
                //删除学生
                DeleteStudent deleteStudent = new DeleteStudent();
                deleteStudent.delete();
            }else if(num==0){
                System.out.println("程序正在退出，请稍等......");
                Thread.sleep(1500);
                flag=false;
                System.out.println("程序已退出");
            }
        }
    }

}
