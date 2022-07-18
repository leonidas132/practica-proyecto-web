package com.protalento.utilidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fechas {
    public static final String PATRONES_FECHA = "yyyy-MM-dd";

    public static final String PATRONES_FECHA_HORA = "yyyy-MM-dd HH:mm:ss";

    //para que no puedan instanciar la clase
    private Fechas() {

    }


    /**
     *obtiene un  localdate de un String
     *@param fecha con patron yyyy-MM-dd
     *@return fecha LocalDate
     **/
    public static LocalDate getLocalDate (String fecha) {
        return LocalDate.parse(fecha, DateTimeFormatter.ofPattern(PATRONES_FECHA));
    }



    /**
     * obtiene un  localdateTime de un String
     *@param fecha con patron yyyy-MM-dd HH:mm:ss
     *@return fecha LocalDateTime
     **/
    public static LocalDateTime getLocalDateTime (String fecha) {
        return LocalDateTime.parse(fecha, DateTimeFormatter.ofPattern(PATRONES_FECHA_HORA));
    }

    /**
     * obtiene un String de un LocalDate
     *@param fecha LocalDte
     *@return fecha String yyyy-MM-dd
     *
     **/
    public static String getString(LocalDate fecha){
        return fecha.format(DateTimeFormatter.ofPattern(PATRONES_FECHA));
    }


    /**
     * obtiene un String de un LocalDateTime
     *@param fecha LocalDateTime
     *@return fecha String yyyy-MM-dd HH:mm:ss
     *
     **/
    public static String getStringHora(LocalDateTime fecha){
        return fecha.format(DateTimeFormatter.ofPattern(PATRONES_FECHA_HORA));
    }

}
