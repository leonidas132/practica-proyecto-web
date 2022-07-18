package com.protalento.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "ServletConsulta", value = "/ServletConsulta")
public class ServletConsulta extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String texto = request.getParameter("texto");
        String url = request.getParameter("url");

        URL url1 = new URL(url);
        String codificacion = StandardCharsets.ISO_8859_1.toString();
        URLConnection URLconnection = url1.openConnection();

        //determinamos el tipo de codificacion del documento que hemos leido

        

    }
}
