
package pe.com.coral.vistas;

import pe.com.coral.dao.CategoriaJDBCDAO;

public class VCategoria {
    
    public boolean isSuperior(int idCat){
        CategoriaJDBCDAO catDao = new CategoriaJDBCDAO();
        return catDao.contarCategoria(idCat);
    }
    
}
