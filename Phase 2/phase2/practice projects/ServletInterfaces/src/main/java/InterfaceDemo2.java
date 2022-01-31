import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class InterfaceDemo2
 */
public class InterfaceDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    ServletConfig config=null;
    public void init(ServletConfig config){
        this.config=config;
        System.out.println("Initialization complete");
     }

     public void service(ServletRequest req,ServletResponse res)
     throws IOException,ServletException{
         res.setContentType("text/html");
         PrintWriter pwriter=res.getWriter();
         pwriter.print("<html>");
         pwriter.print("<body>");
         pwriter.print("In the service() method<br>");
         pwriter.print("</body>");
         pwriter.print("</html>");
     }
     public void destroy(){
         System.out.println("In destroy() method");
     }
     public ServletConfig getServletConfig(){
         return config;
     }
     public String getServletInfo(){
         return "This is a sample servlet info";
     }
}
