package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.view.View;

public class ObservadorVelocidad implements Observer {
    @Override
    public void update(Coche coche, Model model) {
        // Actualizamos la vista con la nueva velocidad
        System.out.println("Velocidad actualizada: " + coche.getVelocidad() + " km/h");
    }
}
