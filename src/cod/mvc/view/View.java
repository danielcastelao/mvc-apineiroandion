package cod.mvc.view;

import javax.swing.JOptionPane;

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
    public static boolean muestraVelocidad(String matricula, Integer velocidad) {
        System.out.println("Matricula: " + matricula + " Velocidad: " + velocidad);
        return true;
    }

    /**
     * Metodo que muestra matricula, modelo y velocidad de un coche
     * @param matricula
     * @param modelo
     * @param velocidad
     * @return true
     */
    public static boolean muestraCoche(String matricula, String modelo, Integer velocidad) {
        JOptionPane.showMessageDialog(null,"Matricula: " + matricula + " Modelo: " + modelo
                + " Velocidad: " + velocidad);
        return true;
    }

    /**
     * Metodo que recoge la matricula del coche con un JOptionPane
     * @return String
     */
    public static String getMatricula() {
        return JOptionPane.showInputDialog("Introduce la matricula del coche");
    }

}
