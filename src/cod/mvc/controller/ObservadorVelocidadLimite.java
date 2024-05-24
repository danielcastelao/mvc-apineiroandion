package cod.mvc.controller;

import cod.mvc.model.Coche;

public class ObservadorVelocidadLimite implements Observer{
    @Override
    public void update(Coche coche) {
        if (coche.getVelocidad() > 120) {
            System.out.println("Velocidad mayor a 120, se bajara 10 km/h");
            coche.setVelocidad(coche.getVelocidad() - 10);
        }
    }
}
