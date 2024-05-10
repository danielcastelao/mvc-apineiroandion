package cod.mvc;

/**
 * Esta calse actua como Controller, y dispone de los metodos necesarios para controlar el funcionamiento de la
 * aplicacion
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void updateView(){
        Coche coche = model.crearCoche("123456", "modeloDelCoche", 15);
        View view = new View();
        view.muestraVelocidad(coche.getMatricula(), coche.getVelocidad());
    }
}
