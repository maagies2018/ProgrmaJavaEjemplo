/*1.	Crea una excepci�n personalizada llamada EdadInvalidaException, cuyo mensaje 
  sea �No se puede tener una edad menor que 0�.

2.	Crea una clase llamada Personaque solo tenga dos atributos: nombre y edad. Con un
 constructor que inicialice los dos atributos y con sus setters y getters.
Tanto en el constructor como en el m�todo setEdad(int edad) debes controlar que no se 
introduzca una edad negativa. Para ello cuando se intente introducir una edad negativa
 (tanto en el constructor como en setEdad) se lanzar� la excepci�n EdadInvalidaException.
Implementa tambi�n el m�todo sobreescrito toString().

3.	En el m�todo principal del programa instancia dos personas, una con edad negativa y
 otra con edad 0. A la segunda intenta asignarle despu�s una edad negativa con el m�todo setEdad.
Justo despu�s de instanciar cada una de las dos personas y de llamar al m�todo setEdad muestra 
por pantalla sus datos por medio del m�todo toString().
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
