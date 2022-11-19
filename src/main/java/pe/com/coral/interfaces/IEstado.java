package pe.com.coral.interfaces;

import java.util.List;
import pe.com.coral.beans.Estado;

public interface IEstado {

    public abstract Estado findById(int idEstado);

    public abstract List<Estado> listAll(int idPais);

    public abstract Estado findById2(int idPais);

    public abstract List<Estado> listAll();

}
