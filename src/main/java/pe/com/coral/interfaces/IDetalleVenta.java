package pe.com.coral.interfaces;

import java.util.List;
import pe.com.coral.beans.DetalleVenta;

public interface IDetalleVenta {

    public abstract List<DetalleVenta> listAllDetallesVentasClientes(int idVenta);

}
