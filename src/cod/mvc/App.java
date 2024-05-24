package cod.mvc;

import cod.mvc.controller.Controller;
import cod.mvc.controller.ObservadorVelocidad;
import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.view.View;

/**
 * Clase App que inicia el programa y pasa el control al controller
 */
public class App {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
}