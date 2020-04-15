package SQlite;

import java.sql.*;

public class Db {

    private static Connection connection;
    private static Statement stm;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    public static void setConnection()throws Exception{
        connection = DriverManager.getConnection("jdbc:sqlite:test.db");
        System.out.println("ok");
    }

    public static void getTable()throws Exception {
            Db.setConnection();
            String sql = "INSERT INTO users (name) VALUES ('пися'); ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            System.out.println("ok, get-INSERT");
    }

    public static void dropTable(String table) throws Exception{
        Db.setConnection();

        stm = connection.createStatement();
        stm.execute("DROP TABLE table ");
        System.out.println("ok, Drop-Table");
    }

    public static void main(String[] args) throws Exception{
        Db.dropTable("prise");
    }
}
