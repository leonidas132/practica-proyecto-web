package com.protalento.servlets;

import com.protalento.entidades.DatosBusqueda;
import com.protalento.implementacion.ImpDatosBusqueda;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "ServletConsulta", value = "/ServletConsulta")
public class ServletConsulta extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String texto = request.getParameter("texto");
        String url = request.getParameter("Url");

        System.out.println(texto);
        System.out.println(url);

        URL URL1  = new URL(url);
        InputStreamReader inputStreamReader = new InputStreamReader(URL1.openStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linea ;
        String html = "";

        while((linea = bufferedReader.readLine()) != null){
            html+=linea + "\n";
        }

        String patron = "<p>.*?</p>";

        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher((html));
        String contenido ="";
        while(matcher.find()){
            contenido += matcher.group()+"\n";

        }
        System.out.println(contenido);

       ImpDatosBusqueda impDatosBusqueda = new ImpDatosBusqueda();
       DatosBusqueda datosBusqueda = new DatosBusqueda(texto,url,contenido, LocalDateTime.now());
       impDatosBusqueda.insertar(datosBusqueda);

       response.sendRedirect("resultados.jsp");








    }
}
