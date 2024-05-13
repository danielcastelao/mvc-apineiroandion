package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.view.View;

public class ObservadorVelocidad implements Observer {
    @Override
    public void update(Coche coche) {
        System.out.println("Ha cambiado la velocidad: "+ String.valueOf(coche.getVelocidad()));
        View.muestraVelocidad(coche.getMatricula(), coche.getVelocidad());
    }
}
