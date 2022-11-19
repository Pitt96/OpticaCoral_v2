package pe.com.coral.interfaces;

import java.util.List;
import pe.com.coral.beans.ProductoMoneda;

public interface IProductoMoneda {

    public abstract List<ProductoMoneda> findById(int idProd);

    public abstract String update(ProductoMoneda pm);

}
