/*1.	Crea una excepción personalizada llamada EdadInvalidaException, cuyo mensaje 
  sea “No se puede tener una edad menor que 0”.

2.	Crea una clase llamada Personaque solo tenga dos atributos: nombre y edad. Con un
 constructor que inicialice los dos atributos y con sus setters y getters.
Tanto en el constructor como en el método setEdad(int edad) debes controlar que no se 
introduzca una edad negativa. Para ello cuando se intente introducir una edad negativa
 (tanto en el constructor como en setEdad) se lanzará la excepción EdadInvalidaException.
Implementa también el método sobreescrito toString().

3.	En el método principal del programa instancia dos personas, una con edad negativa y
 otra con edad 0. A la segunda intenta asignarle después una edad negativa con el método setEdad.
Justo después de instanciar cada una de las dos personas y de llamar al método setEdad muestra 
por pantalla sus datos por medio del método toString().
*/
public class Principal {

    public static void main(String[] args) {
    	Persona per1 = null, per2=null, per3=null;
    	try {
            per1 = new Persona("Juan",-40);
            Leer.mostrarEnPantalla(per1.toString());
        } catch (EdadInvalidaException ex) {
        	Leer.mostrarEnPantalla(""+per1);
            Leer.mostrarEnPantalla("Error: "+ex.getMessage());
        }

        try {
        	per2 = new Persona("Eva",0);
            Leer.mostrarEnPantalla(""+per2);
        } catch (EdadInvalidaException ex) {
        	Leer.mostrarEnPantalla(""+per2);
        	Leer.mostrarEnPantalla("Error: "+ex.getMessage());
        }

        try{
        	per3 = new Persona("Ana",42);
            Leer.mostrarEnPantalla(""+per3);
            Leer.mostrarEnPantalla("Vamos a cambiar la edad de " + per3.getEdad() + " a -5");
            per3.setEdad(-5);
        } catch (EdadInvalidaException ex) {
            Leer.mostrarEnPantalla("Error: "+ex.getMessage());
        }
    	Leer.mostrarEnPantalla(""+per3);
        
        Leer.mostrarEnPantalla("FIN");
    }
    
}
