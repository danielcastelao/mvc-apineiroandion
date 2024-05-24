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
    ObservadorVelocidadLimite observadorVelocidadLimite;
    private Model model;
    private View view;


    public Controller() {
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        //instanciamos observador de velocidad
        observerVelocidad = new ObservadorVelocidad();
        //instanciamos observador de bvelocidad limite
        observadorVelocidadLimite = new ObservadorVelocidadLimite();
        //añadimos los observadores a la lista de observadores
        model.addObserver(observerVelocidad);
        model.addObserver(observadorVelocidadLimite);
        //creamos un coche
        Coche coche = model.crearCoche("123456", "modeloDelCoche", 15);
        //añadimos el coche al parking
        model.parking.add(coche);
        //mostramos la velocidad del coche
        view.muestraVelocidad(coche.getMatricula(), coche.getVelocidad());
        //cambiamos la velocidad del coche
        cambiarVelocidad(coche.getMatricula(), 20);
        //cambiamos a una velocidad a mas 120
        cambiarVelocidad(coche.getMatricula(), 130);
        view.muestraVelocidad(coche.getMatricula(), coche.getVelocidad());

    }

    public void updateView(){
        Coche coche = model.crearCoche("123456", "modeloDelCoche", 15);
        View view = new View();
        view.muestraVelocidad(coche.getMatricula(), coche.getVelocidad());
    }

    public void cambiarVelocidad(String matricula, int nuevaVelocidad) {
        Coche coche = model.getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(nuevaVelocidad);
            //notificamos a los observadores
            notifyObserversVelocidad(coche);
        }
    }
    public void notifyObserversVelocidad(Coche coche) {
        model.notifyObservers(coche);
    }
}
