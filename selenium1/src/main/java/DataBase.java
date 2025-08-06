import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.lang.Class.forName;

public class DataBase {
    public static void main(String[] args) throws Exception {
        String dbUrl = "jdbc:mysql://localhost:3306/nit7am";
        String userName = "root";
        String password = "root";
//        String query = "database";
//        String query = "show Tables";
        String  query = "select * from employee_new ";
//        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl,userName,password);
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);
            System.out.println(result);
            System.out.println("printed");

            while (result.next()){
//                System.out.println(result.getString("tables_in_nit7am"));
//                System.out.println(result);
                  System.out.println(result.getInt("id"));
                System.out.println(result.getString("name"));
                System.out.println(result.getString("email_id"));
                System.out.println(result.getString("password"));
                System.out.println(result.getInt("age"));
                System.out.println(result.getString("salery"));
                System.out.println(result.getString("city"));
                System.out.println(" --------------------------------");



            }

                result.close();
                 stmt.close();
                conn.close();

//        }
//        catch(Exception e){
//            System.out.println("execption");
//        }
    }
}
