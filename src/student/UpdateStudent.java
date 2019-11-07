package student;
import system.System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class UpdateStudent {
    private static System system = new System();

    private static int updateStudentS(Student student) throws Exception{
        //获取数据库连接
        Connection con = system.getCon();

        //SQL语句
        String sql = "update student set studentName=?,studentAge=?,studentClass=?,studentLesson=? where id=?";

        //创建prepareStatement对象
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setString(1, student.getStudentName());
        pstmt.setInt(2, student.getStudentAge());
        pstmt.setInt(3, student.getStudentClass());
        pstmt.setString(4, student.getStudentLesson());
        pstmt.setInt(5, student.getId());

        int result = pstmt.executeUpdate();

        system.close(pstmt, con);
        return result;
    }

    public void update()throws Exception{
        Scanner in = new Scanner(java.lang.System.in);
        java.lang.System.out.print("请输入学生ID:");
        int id = in.nextInt();
        java.lang.System.out.print("请输入学生姓名:");
        String name = in.next();
        java.lang.System.out.print("请输入学生年龄:");
        int age = in.nextInt();
        java.lang.System.out.print("请输入学生班级:");
        int studentClass = in.nextInt();
        java.lang.System.out.print("请输入学生课程:");
        String lesson = in.next();

        Student student = new Student(id, name, age, studentClass, lesson);
        int result = updateStudentS(student);
        if(result==1){
            java.lang.System.out.println("更新成功");
        }else{
            java.lang.System.out.println("更新失败");
        }
    }

}
