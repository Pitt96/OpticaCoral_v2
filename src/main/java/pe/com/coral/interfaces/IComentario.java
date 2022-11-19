package pe.com.coral.interfaces;

import java.util.List;
import pe.com.coral.beans.Comentario;

public interface IComentario {

    public abstract List<Comentario> listAllComentariosxProducto(int idProducto);

    public abstract String insert(Comentario comen);

}
