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
            out.println("<h1>" + "Version 2.0 " + "</h1>");  // Prints "Hello, world!"
            // Set a hyperlink image to refresh this page
            //out.println("<img src='./image.png'>");
            //out.println("</body></html>");
        } finally {
            out.close();  // Always close the output writer
        }
    }
}
