package com.example.delcraetestud;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseHandler extends DataBaseConfig {
    Connection DBConn;
    String connectionStr = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" +dbName + "?" + "autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection getDBConn() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        DBConn = DriverManager.getConnection(connectionStr, dbUser, dbPass);


        return DBConn;
    }

    public void signStudent(String name) throws SQLException, ClassNotFoundException {
        String insert = "insert into " + ConstNameStudent.STUDENT_TABLE + "(" + ConstNameStudent.STUDENTS_FIO + ")" + "values(?)";

        try {
        PreparedStatement pst = getDBConn().prepareStatement(insert);
        pst.setString(1, name);

        pst.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) throws SQLException, ClassNotFoundException {
        String delete = "delete from " + ConstNameStudent.STUDENT_TABLE + " where id_student=?";

        try {
            PreparedStatement pst = getDBConn().prepareStatement(delete);
            pst.setInt(1, id);

            pst.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void selectOnIDFAcultets(int id) throws SQLException, ClassNotFoundException {
        String select = "select from " + ConstNameStudent.STUDENT_TABLE + " where id_facultet=?";

        try {
            PreparedStatement pst = getDBConn().prepareStatement(select);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery(select);
            List<Student> lst = new ArrayList<>();
            while (rs.next()) {

            }

            pst.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
