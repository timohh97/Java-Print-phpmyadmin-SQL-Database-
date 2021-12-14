import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
       Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/besucher","root","");
       Statement statement = c.createStatement();
       String sql = "Select * from user";
       ResultSet rs = statement.executeQuery(sql);
        while(rs.next()) {
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
    }
}
