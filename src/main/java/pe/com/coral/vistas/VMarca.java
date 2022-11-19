
package pe.com.coral.vistas;

import pe.com.coral.dao.MarcaJDBCDAO;

public class VMarca {
    
    public int contarMarca(int idMarca){
        MarcaJDBCDAO mDao = new MarcaJDBCDAO();
        return mDao.contarMarca(idMarca);
    }
    
}
