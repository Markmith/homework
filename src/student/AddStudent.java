package student;

import system.System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddStudent {
    private static System system = new System();

    private static int addStudentS(Student student) throws Exception {

        //获取数据库连接
        Connection con = system.getCon();

        //SQL语句
        String sql = "insert into student values(null,?,?,?,?)";

        //创建prepareStatement对象
        PreparedStatement pstmt = con.prepareStatement(sql);


        pstmt.setString(1, student.getStudentName());


        pstmt.setInt(2, student.getStudentAge());


        pstmt.setInt(3, student.getStudentClass());


        pstmt.setString(4, student.getStudentLesson());

        int result = pstmt.executeUpdate();

        //关闭数据库连接
        system.close(pstmt, con);

        return result;
    }

    public void add() throws Exception {
        Scanner in = new Scanner(java.lang.System.in);
        java.lang.System.out.print("请输入学生的姓名：");
        String name = in.next();
        java.lang.System.out.print("请输入学生的年龄：");
        int age = in.nextInt();
        java.lang.System.out.print("请输入学生的班级：");
        int stuClass = in.nextInt();
        java.lang.System.out.print("请输入学生的课程：");
        String lesson = in.next();
        Student student = new Student(name, age, stuClass, lesson);
        int result = addStudentS(student);
        if (result == 1) {
            java.lang.System.out.println("添加成功");
        } else {
            java.lang.System.out.println("添加失败");
        }
    }

}
