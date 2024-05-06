package cod.mvc;

import java.util.ArrayList;

public class Model {
    public static ArrayList<Coche> parking = new ArrayList<>();
    public Model() {
    }

    public static Coche crearCoche(String matricula, String modelo, Integer velocidad){
        Coche newCar = new Coche(matricula, modelo, velocidad);
        return newCar;
    }
    public static Coche getCoche(String matricula){
        for(Coche coche : parking){
            if(coche.getMatricula().equals(matricula)){
                return coche;
            }
        }
        return null;
    }
    public static boolean cambiarVelocidad(String matricula, Integer velocidad){
        Coche coche = getCoche(matricula);
        coche.setVelocidad(velocidad);
        return true;
    }

    public static Integer getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        return coche.getVelocidad();
    }

    public static ArrayList<Coche> getParking() {
        return parking;
    }

    public static void setParking(ArrayList<Coche> parking) {
        Model.parking = parking;
    }
}
