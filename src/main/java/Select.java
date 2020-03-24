import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Select {

    private static String url = "jdbc:mysql://localhost:3306/test?serverTimezone=Europe/Moscow";
    private static String user = "admin";
    private static String pass = "admin";

    private static ResultSet stratsql() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM users");
        ResultSet ResultSet = stmt.executeQuery();
        return ResultSet;

    }

    public Map getMap() throws Exception {

        ResultSet resultSet = stratsql();
        Map<String, String> dbItem = new HashMap<String, String>();
        while (resultSet.next()) {
            dbItem.put(resultSet.getString("user"), resultSet.getString("login"));
        }
        return dbItem;

    }

    public void getclassName() throws Exception{
        ResultSet resultSet = stratsql();
        resultSet.first();
        User.setUserClass(resultSet.getString("user"));
    }


}
