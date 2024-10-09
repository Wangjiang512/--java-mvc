package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conn {

    Statement stmt;
    Statement stmt1;
    Statement stmt2;
    Statement stmt3;

    public Conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/text?user=root&password=111111&useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false";
            Connection con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            stmt2 = con.createStatement();
            stmt3 = con.createStatement();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public boolean insert(String sql) throws Exception{

        boolean flag=true;
        try {
            stmt1.executeUpdate(sql);

        } catch (Exception e) {
            // TODO: handle exception

            flag=false;
        }
        return flag;

    }

    public boolean update(String sql) throws Exception{

        boolean flag=true;
        try {
            stmt2.executeUpdate(sql);

        } catch (Exception e) {
            // TODO: handle exception
            flag=false;
        }
        return flag;
    }

    public boolean del(String sql) throws Exception{
        boolean flag=true;
        try {
            stmt3.executeUpdate(sql);

        } catch (Exception e) {
            // TODO: handle exception
            flag=false;
        }
        return flag;
    }

    public ResultSet query(String sql) throws Exception{
        return stmt.executeQuery(sql);
    }


}