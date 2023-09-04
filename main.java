import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

class Main 
{
    public static void main(String[] args)
        throws IOException
    {
        Connection c = null;
        try {
           Class.forName("org.postgresql.Driver");
           c = DriverManager
              .getConnection("jdbc:postgresql://localhost:5432/testdb",
              "postgres", "1111");
        } catch (Exception e) {
           e.printStackTrace();
           System.err.println(e.getClass().getName()+": "+e.getMessage());
           System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}