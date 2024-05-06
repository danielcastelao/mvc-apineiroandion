package cod.mvc;

import java.util.ArrayList;

/**
 * Esta clase funciona como MOdel, contiene el arary de coches
 * y los metodos para gestionar el programa
 */
public class Model {
    /**
     * Array List estatico con los coches guardados ene lñ parking
     */
    public static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Constructor
     */
    public Model() {
    }

    /**
     * Crea un nuevo coche
     * @param matricula
     * @param modelo
     * @param velocidad
     * @return nuevo Coche
     */
    public static Coche crearCoche(String matricula, String modelo, Integer velocidad){
        Coche newCar = new Coche(matricula, modelo, velocidad);
        return newCar;
    }

    /**
     * Añade un coche al array parking
     * @param coche
     * @return true si se completo
     */
    public static boolean addCoche(Coche coche){
        return parking.add(coche);
    }
    /**
     * Metodo que devuelve un coche del array segun la maticula
     * que le introduzcas
     * @param matricula
     * @return Coche seleccionado del parking
     */
    public static Coche getCoche(String matricula){
        for(Coche coche : parking){
            if(coche.getMatricula().equals(matricula)){
                return coche;
            }
        }
        return null;
    }

    /**
     * Cambia la velocidad del coche del cual introduces la matricula
     * @param matricula
     * @param velocidad
     * @return OK si se cambio la velocidad
     */
    public static boolean cambiarVelocidad(String matricula, Integer velocidad){
        Coche coche = getCoche(matricula);
        coche.setVelocidad(velocidad);
        return true;
    }

    /**
     * Metodo que devuelve la velocidad del coche del cual introduzcas
     * la matricula
     * @param matricula
     * @return Integer velocidad del coche
     */
    public static Integer getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        return coche.getVelocidad();
    }

    /**
     * getParking
     * @return
     */
    public static ArrayList<Coche> getParking() {
        return parking;
    }

    /**
     * setParking
     * @param parking
     */
    public static void setParking(ArrayList<Coche> parking) {
        Model.parking = parking;
    }
}
