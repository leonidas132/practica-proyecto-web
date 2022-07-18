package com.protalento.interfaces.jdbc;

import java.util.List;

public interface DAOconexion <E> {

    boolean insertar(E e);
    List<E> listar();
}

