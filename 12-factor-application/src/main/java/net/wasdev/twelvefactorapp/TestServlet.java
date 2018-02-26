package net.wasdev.twelvefactorapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test")
public class TestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();
        //out.println("hello world from Container V2.0 Ich werde bekloppt!");
        System.out.println("printed - hello world from demo app - to log file");

        try {
            out.println("<!DOCTYPE html>");  // HTML 5
            out.println("<html><head>");
            out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            out.println("<title>" + "12 Factor Demo Application" + "</title></head>");
            out.println("<body>");
            out.println("<h1>" + "Version 1.0 " + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "I.    Codebase:  Eine im Versionsmanagementsystem verwaltete Codebase, viele Deployments" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "II.   Abhängigkeiten:  Abhängigkeiten explizit deklarieren und isolieren" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "III.  Konfiguration:  Die Konfiguration in Umgebungsvariablen ablegen" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "IV.   Unterstützende Dienste:  Unterstützende Dienste als angehängte Ressourcen behandeln" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "V.    Build, release, run:  Build- und Run-Phase strikt trennen" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "VI.   Prozesse:  Die App als einen oder mehrere Prozesse ausführen" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "VII.  Bindung an Ports:  Dienste durch das Binden von Ports exportieren" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "VIII. Nebenläufigkeit:  Mit dem Prozess-Modell skalieren" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "IX.   Einweggebrauch:  Robuster mit schnellem Start und problemlosen Stopp" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "X.    Dev-Prod-Vergleichbarkeit:  Entwicklung, Staging und Produktion so ähnlich wie möglich halten" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "XI.   Logs:  Logs als Strom von Ereignissen behandeln" + "</h1>");  // Prints "Hello, world!"
            out.println("<h1>" + "XII.  Admin-Prozesse:  Admin/Management-Aufgaben als einmalige Vorgänge behandeln" + "</h1>");  // Prints "Hello, world!"
            
           
            // Set a hyperlink image to refresh this page
            //out.println("<img src='./image.png'>");
            //out.println("</body></html>");
        } finally {
            out.close();  // Always close the output writer
        }
    }
}
