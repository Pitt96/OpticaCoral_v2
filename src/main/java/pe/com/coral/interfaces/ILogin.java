package pe.com.coral.interfaces;

import pe.com.coral.beans.Login;

public interface ILogin {

    public abstract Login validarLogin(String email, String clave);

    public abstract Login listAll(int idPersona);

}
