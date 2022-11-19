package pe.com.coral.interfaces;

import java.util.List;
import pe.com.coral.beans.TipoEmpleado;

public interface ITipoEmpleado {

    public abstract TipoEmpleado findById(int idTipoEmpleado);

    public abstract List<TipoEmpleado> listAll();

}
