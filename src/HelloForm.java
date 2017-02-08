import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloForm extends HttpServlet {
	
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      // Set response content type
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Prime Number Validator";	
      double temp=0;
      boolean isPrime=true;
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
         "transitional//en\">\n";
      double num=Double.parseDouble(request.getParameter("num"));
      out.println(docType + "<html>\n" +
		         "<head><title>" + title + "</title></head>\n" +
		         "<body bgcolor=\"#f0f0f0\">\n" +
		         "<h1 align=\"center\">" + title + "</h1>\n" +
		         "</body></html>"); 
      if(num==0)
      {
    	  out.println(docType + 
    		         "<p>It's neither prime nor composite</p>\n" 
    		         );  
      }
      else
      {
    	
    		    for(int i=2;i<num/2;i++) {
    		     temp=num%i;
    		     if(temp==0)
    			   {
    			      isPrime=false;
    			      break;
    			   }
    			}    		    
    		    	if(isPrime)
    		        {
    		        	out.println(docType + 
    		    		         "<p>It's prime</p>\n" );
    		        	
    		        }
    		        else
    		        {
    		        	out.println(docType + 
   		    		         "<p>It's not prime</p>\n" );
    		        }   
    		}
      }
      
   }
