package cod.mvc;

import cod.mvc.controller.Controller;
import cod.mvc.model.Model;
import cod.mvc.view.View;

/**
 * Clase App que inicia el programa y pasa el control al controller
 */
public class App {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.updateView();
    }
}