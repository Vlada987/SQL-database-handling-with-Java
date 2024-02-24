import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLexapmples {

    final String url = "jdbc:mysql://127.0.0.1:3306/baza";
    final String user ="root";
    final String pass = "4361vlada";

    public Connection connectToDatabase() throws SQLException{
      Connection connect = DriverManager.getConnection(url,user,pass);
      boolean status = connect.isValid(9);
      System.out.println("Connection with base is "+status);
      return connect;


    }

    public void findDataInTable(String q,int n, int i) throws SQLException{
      Statement st = connectToDatabase().createStatement();
      ResultSet rs = st.executeQuery(q);
      for(int a=1; a<n; a++){
        rs.next();
      }
      String searchResult = rs.getString(i);
      System.out.println(searchResult);

    }

    public void editDataInTable(){


    }
    public static void main(String[] args) throws SQLException {
      
      SQLexapmples sqle = new SQLexapmples();
      String q1= "select  * from lista where id=1"; 
      sqle.findDataInTable(q1,2,2);
      

        
    }





}
