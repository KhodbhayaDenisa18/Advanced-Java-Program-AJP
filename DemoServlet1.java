import java.io.*;  
import jakarta.servlet.*;  
import jakarta.servlet.http.*;  
  
  
public class DemoServlet1 extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter pw=res.getWriter();  
  
//creating ServletContext object  
ServletContext context=getServletContext();  
  
//Getting the value of the initialization parameter and printing it  
String driverName=context.getInitParameter("dname");  
pw.println("driver name is="+driverName);  
  
pw.close();  
  
}}  