package pe.com.coral.excepciones;

public class ErrorLoginException extends UserException{
    public ErrorLoginException(String mensaje){
        super(mensaje);
    }
}
