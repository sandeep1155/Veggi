package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import foodupload.foodinterface;
import foodupload.foodinterImpl;
import foodupload.foodgettersetter;
import javax.servlet.annotation.MultipartConfig;
/**
 *
 * @author hp1
 */
@WebServlet(name = "DoUpdateP", urlPatterns = {"/DoUpdateP"})
@MultipartConfig(maxFileSize = 2*1024*1024, maxRequestSize = 10*1024*1024)
public class DoUpdateP extends HttpServlet {

   @Override
 
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Do UpDate Get");
    }

    @Override
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Do UpDate post");
        
        String val[]=req.getParameterValues("UpDate");
        System.out.println( req.getParameterValues("UpDate") );
        
        
        
        foodinterface pdao=new foodinterImpl();
        foodgettersetter p=new foodgettersetter();
        for(int i=0; i<val.length; i++)
        {
        switch(i)
        {
            case 0 : p.setId(Integer.parseInt(val[i])); break;
            case 1 : p.setCarname(val[i]); break;
            case 2 : p.setCarprice(val[i]); break;
            }
        }

        pdao.update(p);
        resp.sendRedirect("fooddetails.jsp");
    }
}