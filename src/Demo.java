import java.sql.*;


public class Demo {
    public static void main(String args[]) throws SQLException {


        String sql = "select name from russian where id = 3";

        String url = "jdbc:postgresql://127.0.0.1:5432/product";
        String username = "postgres";
        String password = "0000.01";
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
        System.out.println("Query Executed Successfully");
    }
}
