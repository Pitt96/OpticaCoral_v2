package pe.com.coral.interfaces;

import java.util.List;
import pe.com.coral.beans.Proveedor;

public interface IProveedor {

    public abstract Proveedor findById(int idProveedor);

    public abstract List<Proveedor> listAll();
}
