import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Saludo extends HttpServlet {
  public void init( ServletConfig conf ) throws ServletException {
    super.init( conf );
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException
  {
    // Si la petici�n entra por aqu� la reenviamos al m�todo doPost()
    doPost( req,res );
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException
  {
    // Recuperamos el nombre del usuario
    String nombre = req.getParameter( "nombre" );
    // Generamos la p�gina de saludo personalizada
    res.setContentType( "text/html" );
    PrintWriter salida = res.getWriter();
    salida.println( "<HTML><BODY>" );
    salida.println( "<H2><FONT color=#008000>Bienvenido a la pr�ctica de CV</font></H2>" );
    salida.println( "<H1 ALIGN=\"CENTER\">" +
      "<FONT COLOR=\"#0000FF\">Seg�n el formulario anterior te llamas:" + nombre );
    salida.println( "</FONT></H1>" );
    salida.println( "<H2><FONT color=#008000>Espero que disfrutes y aprendas mucho</FONT></H2>" );
    salida.println( "</HTML></BODY>" );
  }

  public void destroy() {
  }
}
