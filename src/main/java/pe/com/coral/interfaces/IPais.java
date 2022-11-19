package pe.com.coral.interfaces;

import java.util.List;
import pe.com.coral.beans.Pais;

public interface IPais {

    public abstract Pais findById(int idPais);

    public abstract List<Pais> listAll();
}
