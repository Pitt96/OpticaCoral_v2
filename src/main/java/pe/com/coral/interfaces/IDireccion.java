package pe.com.coral.interfaces;

import pe.com.coral.beans.Direccion;

public interface IDireccion {

    public abstract Direccion findById(int idPersona);

    public abstract String insert(Direccion dir);

    public abstract boolean existe(int idPersona);

    public abstract String update(Direccion dir);

}
