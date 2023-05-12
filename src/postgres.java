import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class postgres {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        String url = "jdbc:postgresql://silly.db.elephantsql.com:5432/tajmiids";
        String username = "tajmiids";
        String password = "leZ7ihuhdzfqiLW5GVxYNT6ftcr1FFy9";

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM acesso");
            while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(2));
                System.out.print("Column 2 returned ");
                System.out.println(rs.getString(3));
            }
            rs.close();
            st.close();
        }
        catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
