package system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class System {
    private static String dbUrl = "C:\\Users\\肖黄清\\Desktop\\2019211662  肖黄清";

    //用户名
    private static String dbUserName = "root";

    //密码
    private static String dbPassword = "123456";

    //驱动名称
    private static String jdbcName = "com.mysql.jdbc.Driver";

    //获取数据连接
    public Connection getCon() throws Exception {
        Class.forName(jdbcName);
        Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        return con;
    }

    //关闭连接
    public void close(PreparedStatement pstmt, Connection con) throws Exception {
        if (pstmt != null) {
            pstmt.close();
            if (con != null) {
                con.close();
            }
        }
    }

}


