package com.protalento.implementacion;

import com.protalento.entidades.DatosBusqueda;
import com.protalento.interfaces.jdbc.DAOconexion;
import com.protalento.interfaces.jdbc.conexion;
import com.protalento.utilidades.Fechas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ImpDatosBusqueda  extends conexion implements DAOconexion<DatosBusqueda>{

    private PreparedStatement preparedStatementInsertar;
    private PreparedStatement preparedStatementListar;


    @Override
    public boolean insertar(DatosBusqueda datosBusqueda) {
        String sql = "insert into datobusqueda(texto,url,contenido_web,fecha)values(?,?,?,?)";

        try {
            if (null == preparedStatementInsertar) {
                preparedStatementInsertar = conexion.getConnexion().prepareStatement(sql);
            }
            //le pasamos los parametros a la consulta
            preparedStatementInsertar.setString(1, datosBusqueda.getText());
            preparedStatementInsertar.setString(2, datosBusqueda.getUrl());
            preparedStatementInsertar.setString(3, datosBusqueda.getContenido_web());
            preparedStatementInsertar.setString(4, Fechas.getStringHora(LocalDateTime.now()));
            return preparedStatementInsertar.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public List<DatosBusqueda> listar() {
        List<DatosBusqueda> listaBusqueda = new ArrayList<>();
        String sql = "select texto,url,contenido_web,fecha from datobusqueda";
        try {
            if(null==preparedStatementListar){
                preparedStatementListar = conexion.getConnexion().prepareStatement(sql);
            }
            ResultSet resultSet = preparedStatementListar.executeQuery();
            while(resultSet.next()){
             DatosBusqueda datosBusqueda = new DatosBusqueda();
             datosBusqueda.setText(resultSet.getString("texto"));
             datosBusqueda.setUrl(resultSet.getString("url"));
             datosBusqueda.setContenido_web(resultSet.getString("contenido_web"));
             datosBusqueda.setFecha(Fechas.getLocalDateTime(resultSet.getString("fecha")));
             listaBusqueda.add(datosBusqueda);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaBusqueda;
    }

    public static void main(String[] args) {
        DatosBusqueda datosBusqueda= new DatosBusqueda("cresio el dolar","www.google.com","<html><head><title>resultados</title></head><body> <tr><th>Texto</th><th>URL</th><th>Fecha</th</tr><t <td>programacion orienta</td><td>www.google.com</td><td>2022-03-03</td>  </tr></body></html>",LocalDateTime.now());
        ImpDatosBusqueda impDatosBusqueda = new ImpDatosBusqueda();
     //   System.out.println(datosBusqueda);
      //  impDatosBusqueda.insertar(datosBusqueda);

        System.out.println(impDatosBusqueda.listar());

    }
}
