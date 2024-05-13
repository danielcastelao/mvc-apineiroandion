package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.view.View;

/**
 * Esta calse actua como Controller, y dispone de los metodos necesarios para controlar el funcionamiento de la
 * aplicacion
 */
public class Controller {
    private ObservadorVelocidad observerVelocidad;
    private Model model = new Model();
    private View view = new View();


    public Controller() {
    }


    public void updateView(){
        Coche coche = model.crearCoche("123456", "modeloDelCoche", 15);
        View view = new View();
        view.muestraVelocidad(coche.getMatricula(), coche.getVelocidad());
    }

    public ObservadorVelocidad addObserverVelocidad(ObservadorVelocidad observerVelocidad) {
        model.addObserver(observerVelocidad);
        return observerVelocidad;
    }
}
