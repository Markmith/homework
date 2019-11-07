package student;
import system.System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class DeleteStudent {
    private static System system = new System();

    private static int deleteStudent(int id)throws Exception{
        //获取数据库连接
        Connection con = system.getCon();

        //SQL语句
        String sql = "delete from student where id=?";

        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, id);

        int result = pstmt.executeUpdate();

        //关闭连接
        system.close(pstmt, con);

        return result;
    }

    public void delete()throws Exception{
        Scanner in = new Scanner(java.lang.System.in);
        java.lang.System.out.print("请输入您要删除的学生ID:");
        int id = in.nextInt();
        int result = deleteStudent(id);
        if(result==1){
            java.lang.System.out.println("删除成功");
        }else{
            java.lang.System.out.println("删除失败");
        }
    }

}
