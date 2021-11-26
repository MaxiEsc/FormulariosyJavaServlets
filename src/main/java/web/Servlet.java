package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //response.setContentType("text/html;charset=UTF-8");
        PrintWriter salida = response.getWriter();

        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");
        String[] tecnologia = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String[] musica = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");

        String musicaJunta = "";
        String tecnologiaJunta = "";

        if (tecnologia != null) {
            for (String t : tecnologia) {
                tecnologiaJunta +=  " -> " + t;
            }
        }else{
            tecnologiaJunta = "sin datos";
        }

        if (musica != null) {
            for (String m : musica) {
                musicaJunta +=  " -> " + m;
            }
        }else{
            musicaJunta= "Sin musica facorita";
        }

        salida.print("<html>");
        salida.print("<head>");
        salida.print("<title>Resultado Servlet</title>");
        salida.print("</head>");
        salida.print("<body>");
        salida.print("<h1>Parametros procesados por Servlet</h1>");
        salida.print("<table border='1'>");
        //___________________________________
        salida.print("<tr>");
        salida.print("<td>");
        salida.print("Usuario");
        salida.print("</td>");
        salida.print("<td>");
        salida.print(usuario);
        salida.print("</td>");
        salida.print("</tr>");
        //___________________________________
        salida.print("<tr>");
        salida.print("<td>");
        salida.print("Contraseña: ");
        salida.print("</td>");
        salida.print("<td>");
        salida.print(contrasenia);
        salida.print("</td>");
        salida.print("</tr>");
        //___________________________________
        salida.print("<tr>");
        salida.print("<td>");
        salida.print("Tecnologias: ");
        salida.print("</td>");
        salida.print("<td>");
        if (tecnologia != null) {
            salida.print(tecnologiaJunta);
        }else{
            salida.print("sin datos");
        }
        salida.print("</td>");
        salida.print("</tr>");
        //___________________________________
        salida.print("<tr>");
        salida.print("<td>");
        salida.print("Genero: ");
        salida.print("</td>");
        salida.print("<td>");
        salida.print(genero);
        salida.print("</td>");
        salida.print("</tr>");
        //___________________________________
        salida.print("<tr>");
        salida.print("<td>");
        salida.print("Profesion: ");
        salida.print("</td>");
        salida.print("<td>");
        salida.print(ocupacion);
        salida.print("</td>");
        salida.print("</tr>");
        //___________________________________
        salida.print("<tr>");
        salida.print("<td>");
        salida.print("Musica Favorita: ");
        salida.print("</td>");
        salida.print("<td>");
        if (musica != null) {
            salida.print(musicaJunta);
        } else {
            salida.print("Musica No seleccionada");
        }
        salida.print("</td>");
        salida.print("</tr>");
        //___________________________________
        salida.print("<tr>");
        salida.print("<td>");
        salida.print("Comentarios: ");
        salida.print("</td>");
        salida.print("<td>");
        salida.print(comentarios);
        salida.print("</td>");
        salida.print("</tr>");
        //___________________________________
        salida.print("</table>");
        salida.print("</body>");
        salida.print("</html>");
    }
}
