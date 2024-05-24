package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class ObservadorVelocidadLimite implements Observer{
    @Override
    public void update(Coche coche, Model model) {
        if (coche.getVelocidad() > 120) {
            System.out.println("Velocidad mayor a 120, se bajara 10 km/h");
            model.cambiarVelocidad(coche.getMatricula(), coche.getVelocidad() - 10);
        }
    }
}
