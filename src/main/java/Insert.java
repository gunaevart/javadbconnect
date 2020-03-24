import java.sql.*;

public class Insert {

    private static String url = "jdbc:mysql://localhost:3306/test?serverTimezone=Europe/Moscow";
    private static String user = "admin";
    private static String pass = "admin";


    public void sqlInsert(int id, String users, String passw, String login) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection(url, user, pass);
        PreparedStatement stmt = connect.prepareStatement
                        ("INSERT INTO users (id, user, pass, login) VALUE (?,?,?,?)");
        stmt.setInt(1, id);
        stmt.setString(2, users);
        stmt.setString(3, passw);
        stmt.setString(4, login);
        stmt.executeUpdate();
    }

}
