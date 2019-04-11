
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad) throws EdadInvalidaException{
        this.nombre = nombre;
        if(edad<0)
            throw new EdadInvalidaException();
        this.edad = edad;
    }


    public String getNombre() {
    	String var1;
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadInvalidaException {
        if(edad<0){
            throw new EdadInvalidaException();
        }
        this.edad = edad;
    }
    
    public String toString(){
       return "Nombre: "+nombre +", Edad: "+edad;
    }
    
}
