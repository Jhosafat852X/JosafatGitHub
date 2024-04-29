package mx.edu.unistmo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

@WebServlet(name = "DemoServlet", urlPatterns = {"/"})

public class DemoServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws  IOException{

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8"); 

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Hello "+ nombre + " "+ apellido +  "<h1>");
        out.println("<h2>Informática<h2>");
        out.println("</body></html>");

        
        out.println("<h2>Calculadora</h2>");
        out.println("<form method='post'>");
        out.println("<input type='number' name='num1' placeholder='Número 1'/>");
        out.println("<input type='number' name='num2' placeholder='Número 2'/>");
        out.println("<select name='operation'>");
        out.println("<option value='add'>Sumar</option>");
        out.println("<option value='subtract'>Restar</option>");
        out.println("<option value='multiply'>Multiplicar</option>");
        out.println("<option value='divide'>Dividir</option>");
        out.println("</select>");
        out.println("<input type='submit' value='Calcular'/>");
        out.println("</form>");

        
        String operation = request.getParameter("operation");
        if (operation != null) {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            double result = 0;

            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        out.println("<p>Error: División por cero.</p>");
                    }
                    break;
            }

            out.println("<h3>Resultado: " + result + "</h3>");
        }

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}

