package cod.mvc.view;

/**
 * Clase con la interfaz y que muetra/recibe datos del usuario
 */
public class View {
    //TODO : Crear un metodo que llame algun tipo de menu que interactue con el usuari

    /**
     * Metodo que muestra la matricula y la velocidad de un coche
     * @param matricula
     * @param velocidad
     * @return true
     */
    public boolean muestraVelocidad(String matricula, Integer velocidad) {
        System.out.println("Matricula: " + matricula + " Velocidad: " + velocidad);
        return true;
    }
}
