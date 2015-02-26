package edu.uniandes.ecos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Hello world!
 *
 */
public class Main extends HttpServlet {

    public static String texto = "";

    public static void main(String[] args) throws Exception {
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new Main()), "/*");
        server.start();
        server.join();
    }
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter pagina=resp.getWriter();
        resp.setContentType("text/html");
        String xvar = req.getParameter("xvar");        
        String numSegvar = req.getParameter("numSegvar");
        String dofvar = req.getParameter("dofvar");
        App app = new App();        
        app.calcularVariables(Double.parseDouble(xvar),Double.parseDouble(numSegvar),Double.parseDouble(dofvar));
        PrintWriter out = resp.getWriter();
        out.print("P =" + app.getP() +"\n");
        
        
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        if(req.getParameter("xvar") != null){
            showHome(req, resp);
        }else{
        PrintWriter out = resp.getWriter();
        out.print("<html>\n"
                + "<body>\n"
                + "<form action=\"/Main\" method=\"POST\">\n"
                +"Ingrese el valor de X :\n Datos: <input type=\"text\" name=\"xvar\">\n"
                + "<br/>\n"
                + "<br />\n"
                +"Ingrese el numero de segmentos:\n Datos: <input type=\"text\" name=\"numSegvar\">\n"
                + "<br/>\n"
                + "<br />\n"
                +"Ingrese el valor de dof :\n Datos: <input type=\"text\" name=\"dofvar\">\n"
                + "<br/>\n"
                + "<br />\n"
                + "<input type=\"submit\" value=\"Submit\" />\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>");
        }        
    }

    private void showHome(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        
    }
}
