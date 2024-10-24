
package zoologico121;

public class AnimalRepetidoException extends RuntimeException
{
    public AnimalRepetidoException(String mensaje) // Recibe por parametros el mensaje a mostrar al lanzar la excepcion
    {
        super(mensaje);
    }
}
