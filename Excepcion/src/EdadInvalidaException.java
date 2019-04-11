
public class EdadInvalidaException extends Exception {

    public EdadInvalidaException() {
        super("No se puede tener menos de 0 años");
    }
}

