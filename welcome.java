import java.io.*;
import jakarta.servlet.*;  
import jakarta.servlet.http.*;  
import java.sql.*;

public class welcome extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Welcome user");
      } 
      public static void main(String args[]){} 
}
