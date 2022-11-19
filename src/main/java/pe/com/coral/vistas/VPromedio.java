package pe.com.coral.vistas;

import pe.com.coral.dao.ValoracionJDBCDAO;

public class VPromedio {

    public int promedioEstrellas(int idProducto) {
        ValoracionJDBCDAO calDao = new ValoracionJDBCDAO();
        return calDao.promedioValoracion(idProducto);
    }

}
