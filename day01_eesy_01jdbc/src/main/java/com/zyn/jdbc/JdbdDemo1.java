package com.zyn.jdbc;

import java.sql.*;

public class JdbdDemo1 {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //2.获取链接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","1234");

        //3.获取操作数据库的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from account");

        //4.执行sql语句
        ResultSet rs = pstm.executeQuery();
        //5.遍历结果集
        while(rs.next()) {
            System.out.println(rs.getString("name"));
        }
        //6.释放结果集
        rs.close();
        pstm.close();
        conn.close();

    }
}
