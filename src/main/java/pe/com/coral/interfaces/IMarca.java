package pe.com.coral.interfaces;

import java.util.List;
import pe.com.coral.beans.Marca;

public interface IMarca {

    public abstract Marca findById(int idMarca);

    public abstract List<Marca> listAll();

    public abstract int contarMarca(int idMar);
}
