import java.sql.*;  
class InsertPrepared{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306,dk","root","root");  
  
PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");  
stmt.setInt(1,101);//1 specifies the first parameter in the query  
stmt.setString(2,"Ratan");  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  