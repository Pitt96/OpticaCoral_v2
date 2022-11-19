package pe.com.coral.interfaces;

import pe.com.coral.beans.Valoracion;

public interface ICalificacion {

    public abstract int promedioValoracion(int idProducto);

    public abstract int valoracionCliente(int idProducto, int idCliente);

    public abstract String insert(Valoracion val);

    public abstract int existeValoracion(int idProducto, int idCliente);

}
