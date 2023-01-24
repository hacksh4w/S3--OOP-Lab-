//(C) JDBC

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 

public class JDBC {
   public static void main(String Args[]) {
       try {
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AlDB", "mec", "mec");
           Statement smt = cn.createStatement();
           String qu = "select * from StudDetails";

           ResultSet rs = smt.executeQuery(qu);
           if (rs.next()) {
               do {
                   System.out.println("Roll No : " + rs.getString(1) + "\nName : " + rs.getString(2) + "\nMarks : "
                           + rs.getString(3));
               } while (rs.next());
           } else {
               System.out.println("Record not Found");
           }
           cn.close();
       } catch (Exception e) {
           System.out.println(e);
       }
   }
}

