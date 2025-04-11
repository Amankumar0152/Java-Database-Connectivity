import java.sql.*;

public class Animal {
    public static void main(String args[]) throws SQLException {

        String sql = "update russian set email = 'amanghostvilla@gmail.com' where id =1 ";

        String url = "jdbc:postgresql://127.0.0.1:5432/product";
        String username = "postgres";
        String password = "00110010 00110110";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();

        int result = st.executeUpdate(sql); // use executeUpdate for DDL queries

        System.out.println("Column added successfully");
    }
}
