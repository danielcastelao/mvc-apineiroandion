package cod.mvc.model;

import cod.mvc.controller.Observer;

import java.util.ArrayList;

/**
 * Esta clase funciona como MOdel, contiene el arary de coches
 * y los metodos para gestionar el programa
 */
public class Model implements Observable{
    /**
     * ArrayListe de observers
     */
    private static final ArrayList<Observer> observers = new ArrayList<>();
    /**
     * Array List estatico con los coches guardados ene lñ parking
     */
    public ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Singelton
     */
    private static Model instance;


    /**
     * Constructor privado
     */
    private Model() {
    }

    /**
     * Metodo que devuelve la instancia de Model
     * @return instance
     */
    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    @Override
    public ArrayList<Observer> getObservers() {
        return null;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Coche coche) {
        for (Observer observer : observers) {
            observer.update(coche, this);
        }
    }

    /**
     * Crea un nuevo coche
     * @param matricula
     * @param modelo
     * @param velocidad
     * @return nuevo Coche
     */
    public Coche crearCoche(String matricula, String modelo, Integer velocidad){
        Coche newCar = new Coche(matricula, modelo, velocidad);
        return newCar;
    }

    /**
     * Añade un coche al array parking
     * @param coche
     * @return true si se completo
     */
    public boolean addCoche(Coche coche){
        return parking.add(coche);
    }
    /**
     * Metodo que devuelve un coche del array segun la maticula
     * que le introduzcas
     * @param matricula
     * @return Coche seleccionado del parking
     */
    public Coche getCoche(String matricula){
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
    public boolean cambiarVelocidad(String matricula, Integer velocidad){
        Coche coche = getCoche(matricula);
        coche.setVelocidad(velocidad);
        notifyObservers(getCoche(matricula));
        return true;
    }

    /**
     * Metodo que devuelve la velocidad del coche del cual introduzcas
     * la matricula
     * @param matricula
     * @return Integer velocidad del coche
     */
    public Integer getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        return coche.getVelocidad();
    }

    /**
     * getParking
     * @return
     */
    public ArrayList<Coche> getParking() {
        return parking;
    }

    /**
     * setParking
     * @param parking
     */
    public void setParking(ArrayList<Coche> parking) {
        this.parking = parking;
    }
}
