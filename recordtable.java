import java.sql.*;
class recordtable
{
   public static void main(String args[])
  {
   try
   {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection con=DriverManager.getConnection("Jdbc:Odbc:record");
     Statement stm=con.createStatement();
	String str="Create table record(Name text,No number)";
	stm.executeUpdate(str);
     System.out.println("Table created");
     con.close();
   }
   catch(Exception e)
  {
    System.out.println(e.toString());
  }
 }
}
  