package com.protalento.entidades;


import java.time.LocalDateTime;

public  class DatosBusqueda {

    private String text ;
    private String url ;
    private String contenido_web;
    private LocalDateTime fecha;

    public DatosBusqueda() {
    }

    public DatosBusqueda(String text, String url, String contenido_web, LocalDateTime fecha) {
        this.text = text;
        this.url = url;
        this.contenido_web = contenido_web;
        this.fecha = fecha;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido_web() {
        return contenido_web;
    }

    public void setContenido_web(String contenido_web) {
        this.contenido_web = contenido_web;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "BUSQUEDA :"+ " text: " + text + " url :" + url + "  contenido_web: " + contenido_web + " fecha: " + fecha +"\n";
    }
}
